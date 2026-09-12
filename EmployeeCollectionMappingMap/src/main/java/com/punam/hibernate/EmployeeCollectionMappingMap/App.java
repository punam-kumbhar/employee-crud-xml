package com.punam.hibernate.EmployeeCollectionMappingMap;

import java.util.HashMap;
import java.util.Map;

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

        Map<String, Integer> skills = new HashMap<>();

        skills.put("Java", 5);
        skills.put("Hibernate", 4);
        skills.put("SQL", 4);
        skills.put("Spring Boot", 3);

        Employee employee = new Employee(2, "Rajat", 45000, skills);

        session.persist(employee);

        transaction.commit();

        session.close();
        factory.close();

        System.out.println("Employee with Map saved successfully!");
    }
}