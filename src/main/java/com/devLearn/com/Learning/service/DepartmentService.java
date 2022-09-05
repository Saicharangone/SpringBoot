package com.devLearn.com.Learning.service;

import com.devLearn.com.Learning.Entity.Department;
import com.devLearn.com.Learning.error.DepartmentNotFoundException;
import com.devLearn.com.Learning.error.NoRecordsFoundException;

import java.util.List;

public interface DepartmentService{
   public Department saveToDB(Department department);
   public List<Department> bulkSaveToDB(List<Department> department);



   public List<Department> getFromDB() throws NoRecordsFoundException;

   public Department getFromDB(Long DepartmentID) throws DepartmentNotFoundException;

   public void deleteFromDB(Long departmentID);

   public Department updateRecordinDB(Long departmentID, Department department);

    public Department getWithName(String department);
}
