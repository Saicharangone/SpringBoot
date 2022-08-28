package com.devLearn.com.Learning.service;

import com.devLearn.com.Learning.Entity.Department;
import com.devLearn.com.Learning.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceIImp implements DepartmentService{

    @Autowired
    private DepartmentRepo departmentRepo;
    @Override
    public Department saveToDB(Department department) {

        return departmentRepo.save(department);
    }

    @Override
    public Department deleteFromDB(Department department) {
        return null;
    }


}
