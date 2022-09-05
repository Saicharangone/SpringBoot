package com.devLearn.com.Learning.repository;

import com.devLearn.com.Learning.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

    public Department findByDepartmentNameIgnoreCase(String departmentName);

}
