package com.ats.application.crm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HBMain {

	private static Session session;

	public static void main(String[] args) {
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			System.out.println("Session created");
			Transaction trans = session.beginTransaction();
			trans.commit();
			System.out.println("commited");
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			
			session.close();
		}

	}

}
