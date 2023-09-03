package com.example.crudjunittesting.controller;

import com.example.crudjunittesting.entity.Employee;
import com.example.crudjunittesting.repository.EmployeeRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
        System.out.println(employee.getFirstName()+" "+ employee.getLastName()+" "+ employee.getEmail());
        return employeeRepository.save(employee);
    }



}
