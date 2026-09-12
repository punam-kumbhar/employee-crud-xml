package com.punam.hibernate.EmployeeComponentMapping;

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

        Address address =new Address("Pune", "Maharashtra", 411001);

        Employee employee =new Employee(1, "Punam", 45000, address);

        session.persist(employee);

        transaction.commit();

        session.close();
        factory.close();

        System.out.println("Employee with Component saved successfully!");
    }
}