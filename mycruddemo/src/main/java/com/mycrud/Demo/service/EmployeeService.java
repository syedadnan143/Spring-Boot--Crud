package com.mycrud.Demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycrud.Demo.entity.Employee;
import com.mycrud.Demo.repos.EmployeeCrudERepo;
@Service
public class EmployeeService implements EmployeeServiceInterface{

	@Autowired
	private EmployeeCrudERepo crudRepo;

	@Override
	public Employee addEmployee(Employee employee) {
		Employee savedEmployee = crudRepo.save(employee);
		return savedEmployee;
	}

	@Override
	public List<Employee> getallemployee() {
		return crudRepo.findAll();
		
	}

	@Override
	public Employee getEmpById(Long empidL) {
		return crudRepo.findById(empidL).get();
	}

	@Override
	public void deleteEmpById(Long empidL) {
		crudRepo.deleteById(empidL);
	}

}