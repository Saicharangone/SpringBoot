package com.devLearn.com.Learning.Controller;


import com.devLearn.com.Learning.Entity.Department;
import com.devLearn.com.Learning.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @PostMapping("/departments")
    public Department saveToDB(@RequestBody Department department){
      return departmentService.saveToDB(department);

    }





}
