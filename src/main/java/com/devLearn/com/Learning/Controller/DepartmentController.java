package com.devLearn.com.Learning.Controller;


import com.devLearn.com.Learning.Entity.Department;
import com.devLearn.com.Learning.error.DepartmentNotFoundException;
import com.devLearn.com.Learning.error.NoRecordsFoundException;
import com.devLearn.com.Learning.service.DepartmentService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger Log= LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveToDB(@Validated @RequestBody Department department){
        Log.info("In Save");
      return departmentService.saveToDB(department);

    }

    @PostMapping("/department")
    public List<Department> bulkSaveToDB(@Validated @RequestBody List<Department> department){
        Log.info("In List of Save");
        return departmentService.bulkSaveToDB(department);

    }

    @GetMapping("/departments")
    public List<Department> getFromDB() throws NoRecordsFoundException {
        Log.info("In get"); return departmentService.getFromDB();
    }

    @GetMapping("/departments/{id}")
    public Department getIDFromDB(@PathVariable("id") Long DepartmentID) throws DepartmentNotFoundException {
        return departmentService.getFromDB(DepartmentID);
    }

    @DeleteMapping("/departments/{id}")
    public  String deleteFromDB(@PathVariable("id") Long DepartmentID){
        departmentService.deleteFromDB(DepartmentID);
        return DepartmentID+" Deleted Sucessfully";
    }

    @PutMapping("/departments/{id}")
    public Department updateRecordinDB(@PathVariable("id") Long DepartmentID, @RequestBody Department department){
       return departmentService.updateRecordinDB(DepartmentID,department);

    }

    @GetMapping("/departments/name/{name}")
    public  Department getWithName(@PathVariable("name") String department){
        return departmentService.getWithName(department);
    }





}
