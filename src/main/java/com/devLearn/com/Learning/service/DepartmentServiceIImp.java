package com.devLearn.com.Learning.service;

import com.devLearn.com.Learning.Entity.Department;
import com.devLearn.com.Learning.error.DepartmentNotFoundException;
import com.devLearn.com.Learning.error.NoRecordsFoundException;
import com.devLearn.com.Learning.repository.DepartmentRepo;
import com.sun.istack.NotNull;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceIImp implements DepartmentService{

    @Autowired
    private DepartmentRepo departmentRepo;
    @Override
    public Department saveToDB(Department department) {

        return departmentRepo.save(department);
    }

    @Override
    public List<Department> bulkSaveToDB(List<Department> department) {
        return departmentRepo.saveAll(department);
    }



    @Override
    public List<Department> getFromDB() throws NoRecordsFoundException {

       List<Department> department=departmentRepo.findAll();
       if(department.isEmpty()){
           throw new NoRecordsFoundException("No Records Found");
       }
        return department;
    }

    @Override
    public Department getFromDB(Long DepartmentID) throws DepartmentNotFoundException {

        Optional<Department>  department = departmentRepo.findById(DepartmentID);
        if(!department.isPresent()){
            throw new DepartmentNotFoundException("Department Not Found");

        }
        return department.get();
    }

    @Override
    public void deleteFromDB(Long DepartmentID) {
        departmentRepo.deleteById(DepartmentID);

    }

    @Override
    public Department updateRecordinDB(Long departmentID, Department department) {
       Department depData = departmentRepo.findById(departmentID).get();

       if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())){
                depData.setDepartmentName(department.getDepartmentName());
       }
        if(Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())){
            depData.setDepartmentAddress(department.getDepartmentAddress());
        }
        if(Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())){
            depData.setDepartmentCode(department.getDepartmentCode());
        }

       return departmentRepo.save(depData);

    }

    @Override
    public Department getWithName(String department) {
        return departmentRepo.findByDepartmentNameIgnoreCase(department);
    }


}
