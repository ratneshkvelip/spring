package com.example.demo_jpa.controller;


import com.example.demo_jpa.dao.EmployeeDAO;
import com.example.demo_jpa.entity.Employee;
import com.example.demo_jpa.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService){
        employeeService=theEmployeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }


    @GetMapping("/employee/{EmployeeId}")
    public Employee findA(@PathVariable int EmployeeId){
        return employeeService.find(EmployeeId);
    }


}
