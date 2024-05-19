package com.sham.Practice.Service;

import com.sham.Practice.Entity.Employee;
import com.sham.Practice.Repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService{
    @Autowired
    private EmpRepo repo;
    @Override
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    @Override
    public Employee addEmployee(Employee emp) {
       Employee savedEmp = repo.save(emp);
       return savedEmp;
    }

    @Override
    public Employee getEmployees(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Employee updateEmployee(Long id, Employee emp) {
        Employee employee =repo.save(emp);
        return employee;
    }


}
