package com.punam.hibernate.EmployeeCollectionMappingSet;

import java.util.Set;

public class Employee {

    private int id;
    private String name;
    private double salary;
    private Set<String> skills;

    public Employee() {
    }

    public Employee(int id, String name, double salary, Set<String> skills) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.skills = skills;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Set<String> getSkills() {
        return skills;
    }

    public void setSkills(Set<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id +", name=" + name +", salary=" + salary +", skills=" + skills + "]";
    }
}