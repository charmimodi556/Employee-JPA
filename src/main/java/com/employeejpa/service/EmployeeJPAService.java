package com.employeejpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeejpa.EmployeeJPA;

@Service
public class EmployeeJPAService {

	@Autowired
	EmployeeJPARepository employeeJPARepository;
	
	public void addEmp(EmployeeJPA employeeJPA) {
		employeeJPARepository.save(employeeJPA);
	}

	public void updateEmp(EmployeeJPA employeeJPA) {
		employeeJPARepository.save(employeeJPA);	
	}

	public void delete(int id) {
		employeeJPARepository.deleteById(id);
	}

	public List<EmployeeJPA> listEmp() {
		List<EmployeeJPA> listEmp = new ArrayList<EmployeeJPA>();
		employeeJPARepository.findAll().forEach(emp1 -> listEmp.add(emp1));
		return listEmp;
	}

	public EmployeeJPA maxSalary() {
		
		List<EmployeeJPA> listEmp = listEmp();
		
		EmployeeJPA temp=null;
		
		int max = 0;
		
		for(int i=0;i<listEmp.size();i++) {
			if(listEmp.get(i).getSalary() > max) {
				max = listEmp.get(i).getSalary();
				temp = listEmp.get(i);
			}
		}
		
		return temp;
	}

	public int totalSalary() {
		
		List<EmployeeJPA> listEmp = listEmp();
		
		int salary=0;
		
		for(int i=0;i<listEmp.size();i++) {
			salary = salary + listEmp.get(i).getSalary();
		}
		
		return salary;
	}

	public EmployeeJPA minSalary() {
		List<EmployeeJPA> listEmp = listEmp();
		
		EmployeeJPA temp=null;
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<listEmp.size();i++) {
			if(listEmp.get(i).getSalary() < min) {
				min = listEmp.get(i).getSalary();
				temp = listEmp.get(i);
			}
		}
		
		return temp;
	}

	public int averageAge() {
		
		List<EmployeeJPA> listEmp = listEmp();
		
		int age = 0;
		
		for(int i=0;i<listEmp.size();i++) {
			age = age + listEmp.get(i).getAge();
		}
		
		int avg = age / listEmp.size();
		
		return avg;
	}
	
}
