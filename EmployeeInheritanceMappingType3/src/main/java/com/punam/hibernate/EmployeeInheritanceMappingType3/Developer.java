package com.punam.hibernate.EmployeeInheritanceMappingType3;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "developer_inheritance_type3")
public class Developer extends Employee {

    private String programmingLanguage;

    public Developer() {
    }

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "Developer [id=" + getId() + ", name=" + getName() + ", salary=" + getSalary()+ ", programmingLanguage=" + programmingLanguage + "]";
    }
}