package com.sham.Practice.Service;

import com.sham.Practice.Entity.Employee;

import java.util.List;

public interface EmpService {
    List<Employee> getAllEmployees();

    Employee addEmployee(Employee emp);

    Employee getEmployees(Long id);

    void deleteById(Long id);

    Employee updateEmployee(Long id, Employee emp);
}
