package com.example.demo_jpa.dao;

import com.example.demo_jpa.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee find(int id);
}
