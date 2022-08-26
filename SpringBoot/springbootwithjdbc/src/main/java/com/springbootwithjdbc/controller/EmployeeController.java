package com.springbootwithjdbc.controller;

import com.springbootwithjdbc.dto.EmployeeDto;
import com.springbootwithjdbc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees/{id}")
    public EmployeeDto getEmployee(@PathVariable String id){
        return employeeService.getEmployee(Integer.parseInt(id));
    }
}
