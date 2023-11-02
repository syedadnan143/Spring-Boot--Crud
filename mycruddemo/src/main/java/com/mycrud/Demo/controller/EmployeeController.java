package com.mycrud.Demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycrud.Demo.entity.Employee;
import com.mycrud.Demo.repos.EmployeeCrudERepo;
import com.mycrud.Demo.service.EmployeeServiceInterface;


@RestController
@RequestMapping("/code")
public class EmployeeController {
	

	@Autowired
	private EmployeeServiceInterface employeeServiceInterface;

	@PostMapping("/save")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		Employee employeeSaved = employeeServiceInterface.addEmployee(employee);
		return new ResponseEntity<Employee>(employeeSaved, HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployees(){

		List<Employee> listOfAllEmps = employeeServiceInterface.getallemployee();
		return new ResponseEntity<List<Employee>>(listOfAllEmps, HttpStatus.OK);
	}
	@GetMapping("/emp/{empid}")
	public ResponseEntity<Employee> getEmpById(@PathVariable("empid") Long empidL){

		Employee empRetrieved = employeeServiceInterface.getEmpById(empidL);
		return new ResponseEntity<Employee>(empRetrieved, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{empid}")
	public ResponseEntity<Void> deleteEmpById(@PathVariable("empid") Long empidL){

		employeeServiceInterface.getEmpById(empidL);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}

	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
		Employee employeeSaved = employeeServiceInterface.addEmployee(employee);
		return new ResponseEntity<Employee>(employeeSaved, HttpStatus.CREATED);
	}
    @GetMapping("/")
	public String home() {
		return "<h1>welcome....</h1>";
	}
	@GetMapping("/user")
	public String user() {
		return "<h1>hi user</h1>";
	}
    
	
}

/*@RestController
@RequestMapping("/code")
public class EmployeeController {
	@Autowired
	EmployeeCrudERepo empCrud;
	
	
	@GetMapping
	public List<Employee> getallemployee(){
		System.out.println("getting all employees");
		List<Employee> empList=empCrud.findAll();
		
		System.out.println("emp size :"+empList.size());
		 for(Employee emp:empList){
			 System.out.println(emp.toString());
		 }
		 return empList;
	}*/
	

//}
