package com.springbootwithjdbc.service;

import com.springbootwithjdbc.dao.EmployeeDao;
import com.springbootwithjdbc.dto.EmployeeDto;
import com.springbootwithjdbc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    public EmployeeDao employeeDao;
    @Override
    public EmployeeDto getEmployee(int id) {
        Optional<Employee> employeeOp = employeeDao.findById(id);
        EmployeeDto employeeDto = new EmployeeDto();
        if(employeeOp.isPresent()){
            Employee employee = employeeOp.get();
            employeeDto.setId(employee.getId());
            employeeDto.setFname(employee.getFname());
            employeeDto.setLname(employee.getLname());
            employeeDto.setPosition(employee.getPosition());
        }
        return employeeDto;
    }
}
