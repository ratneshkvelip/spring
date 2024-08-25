package com.example.demo_jpa.dao;

import com.example.demo_jpa.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager theEntityManager){
        entityManager=theEntityManager;
    }

    @Override
    public List<Employee> findAll() {

        //create query
        TypedQuery<Employee> query=entityManager.createQuery("from Employee",Employee.class);

        //execute query
        List<Employee> employees=query.getResultList();

        return employees;

    }

    @Override
    public Employee find(int id){

        TypedQuery<Employee>query=entityManager.createQuery("FROM EMPLOYEE WHERE id=:id",Employee.class);

        query.setParameter("id",id);
        Employee employee=query.getSingleResult();

        return employee;
    }
}
