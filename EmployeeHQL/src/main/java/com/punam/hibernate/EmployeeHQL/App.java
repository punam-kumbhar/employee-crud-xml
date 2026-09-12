package com.punam.hibernate.EmployeeHQL;

import java.util.List;

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

        Employee e1 = new Employee(10, "Rahul", 45000);
        Employee e2 = new Employee(11, "Amit", 55000);
        Employee e3 = new Employee(12, "Sneha", 50000);

        session.persist(e1);
        session.persist(e2);
        session.persist(e3);

        List<Employee> employees = session.createQuery("from Employee", Employee.class).getResultList();

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        int rowsUpdated = session.createMutationQuery("update Employee set salary = :salary where id = :id"
        )
        .setParameter("salary", 60000.0)
        .setParameter("id", 11)
        .executeUpdate();

        int rowsDeleted = session.createMutationQuery("delete from Employee where id = :id"
        )
        .setParameter("id", 12)
        .executeUpdate();

        transaction.commit();

        session.close();
        factory.close();
    }
}