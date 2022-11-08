package com.employeejpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class EmployeeJPA {
	@Id
	@Column
	int id;
	@Column
	String name;
	@Column
	String dep;
	@Column
	int salary;
	@Column
	int age;
	
	public EmployeeJPA(int id, String name, String dep, int salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.salary = salary;
		this.age = age;
	}

	public EmployeeJPA() {
		super();
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

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
