package com.punam.hibernate.EmployeeCollectionMappingList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {

        Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();

        Employee e = new Employee("Punam", 30000);

        e.getSkills().add("Java");
        e.getSkills().add("Hibernate");
        e.getSkills().add("MySQL");
        e.getSkills().add("Spring Boot");

        s.persist(e);

        t.commit();

        System.out.println("Employee inserted successfully.");
        System.out.println("Employee ID: " + e.getId());

        s.close();

        Session s2 = sf.openSession();

        Employee employee = s2.get(Employee.class, e.getId());


        s2.close();

        sf.close();

       ;
    }
}