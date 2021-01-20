package com.abt.departmentservice.controller;

import com.abt.departmentservice.entity.Department;
import com.abt.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment Method of Department Controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/")
    public List<Department> departmentList(){
        return departmentService.departmentList();
    }

    @GetMapping("/{id}")
    public Department departmentById(@PathVariable("id") Long departmentId){
        return departmentService.departmentById(departmentId);
    }

}
