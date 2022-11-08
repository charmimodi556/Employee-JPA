package com.employeejpa.service;

import org.springframework.data.repository.CrudRepository;

import com.employeejpa.EmployeeJPA;

public interface EmployeeJPARepository extends CrudRepository<EmployeeJPA, Integer> {

}
