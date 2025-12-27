package com.example.springboot_cicid1;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeRepository repo;

    public EmployeeController(EmployeeRepository repo){
        this.repo = repo;
    }

    @PostMapping
    public Employee save(@RequestBody Employee emp){
        return repo.save(emp);
    }

    @GetMapping
    public List<Employee> getAll(){
        return repo.findAll();
    }
}
