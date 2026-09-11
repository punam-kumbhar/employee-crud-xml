package com.punam.hibernate.employee_crud_annotation;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "hibernate_table")
public class Employee implements Serializable {

    @Id
    @Column(name = "eid")
    private int id;

    @Column(name = "ename")
    private String name;

    @Column(name = "edepartment")
    private String department;

    @Column(name = "erole")
    private String role;

    @Column(name = "esalary")
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, String department, String role, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.role = role;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id
                + ", name=" + name
                + ", department=" + department
                + ", role=" + role
                + ", salary=" + salary + "]";
    }
}