package com.luv2code.springboot.demosecurity.dao;

import com.luv2code.springboot.demosecurity.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

    // add method to sort my First Name
    public List<Employee> findAllByOrderByFirstNameAsc();


}
