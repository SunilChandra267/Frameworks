package edu.jspiders.firsthibproject.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SweetDAO {

	public void create(SweetDTO dto)
	{
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(SweetDTO.class);
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		session.save(dto);
		tx.commit();
		session.close();
		factory.close();
	}
}
