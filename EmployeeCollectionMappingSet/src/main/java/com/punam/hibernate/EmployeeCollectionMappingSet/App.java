package com.punam.hibernate.EmployeeCollectionMappingSet;

import java.util.HashSet;
import java.util.Set;

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

        Set<String> skills = new HashSet<>();

        skills.add("Java");
        skills.add("Hibernate");
        skills.add("SQL");
        skills.add("Spring Boot");

        Employee employee =new Employee(3, "Punam", 45000, skills);

        session.persist(employee);

        transaction.commit();

        session.close();
        factory.close();

        System.out.println("Employee saved successfully!");
    }
}