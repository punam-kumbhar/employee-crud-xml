package com.punam.hibernate.EmployeeCollectionMappingMap;

import java.util.Map;

public class Employee {

    private int id;
    private String name;
    private double salary;
    private Map<String, Integer> skills;

    public Employee() {
    }

    public Employee(int id, String name, double salary, Map<String, Integer> skills) {
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

    public Map<String, Integer> getSkills() {
        return skills;
    }

    public void setSkills(Map<String, Integer> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name +", salary=" + salary + ", skills=" + skills + "]";
    }
}