package com.punam.hibernate.employee_crud_xml;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private int id;
	private String name;
	private String department;
	private String role;
	private int salary;
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
	public Employee(int id, String name, String department, String role, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.role = role;
		this.salary = salary;
	}
	
	public Employee() {}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", role=" + role + ", salary="
				+ salary + "]";
	}
	
	
	
	
}