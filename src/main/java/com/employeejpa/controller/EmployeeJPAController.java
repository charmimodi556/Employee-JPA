package com.employeejpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeejpa.EmployeeJPA;
import com.employeejpa.service.EmployeeJPAService;

@RestController
@RequestMapping("/employeeJPA")
public class EmployeeJPAController {

	@Autowired
	EmployeeJPAService employeeJPAService;
	
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody EmployeeJPA employeeJPA) {
		employeeJPAService.addEmp(employeeJPA);
		return "Data added successfully";
	}
	
	@PutMapping("/updateEmployee")
	public String updateEmployee(@RequestBody EmployeeJPA employeeJPA) {
		employeeJPAService.updateEmp(employeeJPA);
		return "Employee details updated successfully";
	}
	
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		employeeJPAService.delete(id);
		return "Employee data deleted!!";
	}
	
	@GetMapping("/")
	public List<EmployeeJPA> listEmployee() {
		List<EmployeeJPA> listEmployees = employeeJPAService.listEmp();
		return listEmployees;
	}
	
	@GetMapping("/maxSalary")
	public EmployeeJPA maxSalary() {
		EmployeeJPA maxSalary = employeeJPAService.maxSalary();
		return maxSalary;
	}
	
	@GetMapping("/totalSalary")
	public int totalSalary() {
		int total = employeeJPAService.totalSalary();
		return total;
	}
	
	@GetMapping("/minSalary")
	public EmployeeJPA minSalary() {
		EmployeeJPA minSalary = employeeJPAService.minSalary();
		return minSalary;
	}
	
	@GetMapping("/avgAge")
	public int avgAge() {
		int avg = employeeJPAService.averageAge();
		return avg;
	}
	
}
