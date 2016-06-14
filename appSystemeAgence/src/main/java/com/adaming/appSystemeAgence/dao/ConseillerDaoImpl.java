package com.adaming.appSystemeAgence.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class ConseillerDaoImpl implements IConseillerDao {
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * setter pour injection spring 
	 * @param sessionFactory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional(readOnly = true)
	public Boolean isExist(int idConseiller) {
		Session session = sessionFactory.openSession();

		String hqlReq = "FROM Conseiller WHERE id= :conseillerID";
		Query query = session.createQuery(hqlReq);
		query.setParameter("conseillerID", idConseiller);
		
		// query.uniqueResult returns a single instance that matches the query, 
		// or null if the query returns no results
		return (Long)query.uniqueResult()>0;
	}

}
