package com.punam.hibernate.EmployeeInheritanceMappingType2;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "manager_inheritance_type2")
@PrimaryKeyJoinColumn(name = "id")
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
        return "Manager [id=" + getId()+ ", name=" + getName()+ ", salary=" + getSalary()+ ", teamSize=" + teamSize + "]";
    }
}