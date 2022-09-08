package com.mavenDemo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StoreData {
	public static void main(String args[]) {

		List<Laptop> list = new ArrayList<Laptop>();
		list.add(new Laptop(1, "Sony", "16gb"));
		list.add(new Laptop(2, "HP", "8gb"));
		list.add(new Laptop(3, "Dell", "4gb"));
		list.add(new Laptop(4, "Lenovo", "8gb"));
		list.add(new Laptop(5, "Asus", "4gb"));
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();

		for(Laptop l : list) {
			try {
			  if(l.getType()=="Sony"||l.getType()=="HP"||l.getType()=="Lenovo") {
				session.save(l);
			  }
			  else
				  throw new Exception(l.getType()+" Type entered Not Valid");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		session.getTransaction().commit();
		session.close();
	}

}
