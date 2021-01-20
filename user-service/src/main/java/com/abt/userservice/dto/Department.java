package com.abt.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
