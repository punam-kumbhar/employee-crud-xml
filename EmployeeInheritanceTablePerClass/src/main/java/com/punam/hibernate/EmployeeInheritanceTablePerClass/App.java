package com.punam.hibernate.EmployeeInheritanceTablePerClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {

        Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Manager manager = new Manager(3, "Puja", 60000, "HR");

        Developer developer =new Developer(4, "priyanka", 55000, "Java");

        session.persist(manager);
        session.persist(developer);

        transaction.commit();

        session.close();
        factory.close();

        System.out.println("Done...");
    }
}