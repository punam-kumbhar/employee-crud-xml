package com.punam.hibernate.EmployeeInheritanceMappingType1;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("DEVELOPER")
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
        return "Developer [id=" + getId()+ ", name=" + getName()+ ", salary=" + getSalary()+ ", programmingLanguage=" + programmingLanguage + "]";
    }
}