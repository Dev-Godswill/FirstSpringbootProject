package com.daudugodswill.Springboot.project.service;

import com.daudugodswill.Springboot.project.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {

    //department service
    @Autowired
    private DepartmentService departmentService;

    @BeforeEach
    void setUp() {
    }

    @Test
    public void whenValidDepartmentName_thenDepartmentShouldBeFound() {
        String departmentName = "CSC";
        Department found =
                departmentService.fetchDepartmentByName(departmentName);

        //match if both are equal then my test cases pass
        assertEquals(departmentName, found.getDepartmentName());
    }
}