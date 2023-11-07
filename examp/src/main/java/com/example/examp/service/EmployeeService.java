package com.example.examp.service;

import com.example.examp.entity.Employee;
import com.example.examp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;



@Service
public class EmployeeService {


    @Autowired

    private EmployeeRepository employeeRepository;
    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }


}
