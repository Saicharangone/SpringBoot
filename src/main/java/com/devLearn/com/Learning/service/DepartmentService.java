package com.devLearn.com.Learning.service;

import com.devLearn.com.Learning.Entity.Department;

public interface DepartmentService{
   public Department saveToDB(Department department);

   public Department deleteFromDB(Department department);
}
