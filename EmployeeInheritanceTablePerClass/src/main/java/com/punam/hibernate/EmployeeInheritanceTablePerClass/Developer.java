package com.punam.hibernate.EmployeeInheritanceTablePerClass;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer() {
    }

    public Developer(int id, String name, double salary,
                     String programmingLanguage) {
        super(id, name, salary);
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
        return "Developer [programmingLanguage=" +programmingLanguage + "]";
    }
}