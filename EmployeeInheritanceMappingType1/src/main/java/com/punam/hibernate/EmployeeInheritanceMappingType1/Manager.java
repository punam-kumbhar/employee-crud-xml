package com.punam.hibernate.EmployeeInheritanceMappingType1;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("MANAGER")
public class Manager extends Employee {

    private int teamSize;

    public Manager() {
    }

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return "Manager [id=" + getId()+ ", name=" + getName() + ", salary=" + getSalary() + ", teamSize=" + teamSize + "]";
    }
}