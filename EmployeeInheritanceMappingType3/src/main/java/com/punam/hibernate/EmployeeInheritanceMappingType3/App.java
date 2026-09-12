package com.punam.hibernate.EmployeeInheritanceMappingType3;

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

        Developer d = new Developer("Punam",30000,"Java");

        Manager m = new Manager("Priya",50000,10);

        s.persist(d);
        s.persist(m);

        t.commit();

        System.out.println("Developer and Manager inserted successfully...");

        System.out.println("Developer ID: " + d.getId());
        System.out.println("Manager ID: " + m.getId());

        s.close();

      
        Session s2 = sf.openSession();

        Developer developer = s2.get(Developer.class, d.getId());
        Manager manager = s2.get(Manager.class, m.getId());

        s2.close();

        sf.close();

     
    }
}