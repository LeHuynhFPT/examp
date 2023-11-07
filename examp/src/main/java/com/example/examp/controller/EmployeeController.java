package com.example.examp.controller;


import com.example.examp.entity.Employee;
import com.example.examp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@Controller

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }
    @GetMapping
    public List<Employee> getALLEmployees(){
        return employeeService.findAllEmployees();
    }
    @GetMapping
    public String createEmployeeForm(){
        return "createEmployee";

    }
    @GetMapping("/listEmployees")
    public String showListEmployeeForm(Model model) {
        List<Employee> employeeList = employeeService.findAllEmployees();
        model.addAttribute("employeeList", employeeList);
        return "listEmployeeForm";
    }

}
