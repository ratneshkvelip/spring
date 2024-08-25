package com.example.demo_jpa.services;


import com.example.demo_jpa.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll() ;

    Employee find(int id);


}
