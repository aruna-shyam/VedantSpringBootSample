package com.palle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.palle.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

}