package com.example.spring_boot_jpa_rest.service;

import com.example.spring_boot_jpa_rest.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public List<Employee> getEmployees();

    public Employee getEmployeeById(Long id);

    public Employee saveEmployee(Employee employee);

    public Employee updateEmployee(Long id, Employee employee);

    public void deleteEmployee(Long id);
}
