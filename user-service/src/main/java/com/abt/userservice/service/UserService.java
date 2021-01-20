package com.abt.userservice.service;

import com.abt.userservice.dto.Department;
import com.abt.userservice.dto.ResponseTemplateDTO;
import com.abt.userservice.entity.User;
import com.abt.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {

        return userRepository.save(user);
    }

    public ResponseTemplateDTO userDetails(Long userId) {
        ResponseTemplateDTO dto = new ResponseTemplateDTO();

        User user = userRepository.findByUserId(userId);

        Department department =
                restTemplate.getForObject("http://localhost:8080/departments/"+user.getDepartmentId(), Department.class);

        dto.setUser(user);
        dto.setDepartment(department);

        return dto;
    }

}
