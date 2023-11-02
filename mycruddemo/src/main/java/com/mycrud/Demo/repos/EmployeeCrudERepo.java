package com.mycrud.Demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.mycrud.Demo.entity.Employee;

@Repository
public interface EmployeeCrudERepo extends JpaRepository<Employee, Long> {
	

}