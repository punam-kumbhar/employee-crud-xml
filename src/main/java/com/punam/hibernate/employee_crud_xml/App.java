package com.punam.hibernate.employee_crud_xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {

        Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory();

        
        Session s1 = sf.openSession();
        Transaction t1 = s1.beginTransaction();

        Employee e1 = new Employee(2, "punam", "IT", "Dev", 12345);

        s1.persist(e1);

        t1.commit();
        s1.close();

        System.out.println("CREATE : Employee Inserted Successfully");

        Session s2 = sf.openSession();

        Employee e2 = s2.get(Employee.class, 2);

        if (e2 != null) {
            System.out.println("READ : Employee Found");
            System.out.println(e2);
        } else {
            System.out.println("READ : Employee Not Found");
        }

        s2.close();


        Session s3 = sf.openSession();
        Transaction t3 = s3.beginTransaction();

        Employee e3 = s3.get(Employee.class, 2);

        if (e3 != null) {

            e3.setName("Punam Kumbhar");
            e3.setDepartment("Software");
            e3.setRole("Java Developer");
            e3.setSalary(25000);

            t3.commit();

            System.out.println("UPDATE : Employee Updated Successfully");

        } else {

            System.out.println("UPDATE : Employee Not Found");
            t3.rollback();

        }

        s3.close();


        Session s4 = sf.openSession();
        Transaction t4 = s4.beginTransaction();

        Employee e4 = s4.get(Employee.class, 2);

        if (e4 != null) {

            s4.remove(e4);

            t4.commit();

            System.out.println("DELETE : Employee Deleted Successfully");

        } else {

            System.out.println("DELETE : Employee Not Found");
            t4.rollback();

        }

        s4.close();

        sf.close();

        System.out.println("All CRUD Operations Completed Successfully");

    }
}