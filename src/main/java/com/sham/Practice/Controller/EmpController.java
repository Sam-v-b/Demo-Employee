package com.sham.Practice.Controller;

import com.sham.Practice.Entity.Employee;
import com.sham.Practice.Repo.EmpRepo;
import com.sham.Practice.Service.EmpService;
import com.sham.Practice.Service.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sam")
public class EmpController {
    @Autowired
    private EmpService service;

    @PostMapping("/save")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp ){
        Employee employee = service.addEmployee(emp);
        return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee> list= service.getAllEmployees();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    @GetMapping("/emp/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Long id){
        Employee emp = service.getEmployees(id);
        return new ResponseEntity<>(emp,HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestParam Employee emp){
        Employee employee =service.updateEmployee(id,emp);
        return new ResponseEntity<>(employee,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id){
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
