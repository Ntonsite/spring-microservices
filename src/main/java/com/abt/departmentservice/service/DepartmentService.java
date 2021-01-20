package com.abt.departmentservice.service;

import com.abt.departmentservice.entity.Department;
import com.abt.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment service Method");
        return departmentRepository.save(department);
    }

    public List<Department> departmentList() {
        return departmentRepository.findAll();
    }


    public Department departmentById(Long departmentId) {
        return departmentRepository.getDepartmentById(departmentId);
    }
}
