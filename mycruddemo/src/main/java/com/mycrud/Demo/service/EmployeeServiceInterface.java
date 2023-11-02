package com.mycrud.Demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mycrud.Demo.entity.Employee;

public interface EmployeeServiceInterface  {


	public Employee addEmployee(Employee employee);

	public List<Employee> getallemployee();



	public Employee getEmpById(Long empidL);

	public void deleteEmpById(Long empidL);

}
