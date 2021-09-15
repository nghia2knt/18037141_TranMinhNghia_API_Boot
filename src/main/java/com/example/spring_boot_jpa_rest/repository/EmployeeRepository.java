package com.example.spring_boot_jpa_rest.repository;

import com.example.spring_boot_jpa_rest.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {
}
