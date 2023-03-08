package com.crudoperation.crud.service;

import com.crudoperation.crud.Exception.ResourceNotFoundException;
import com.crudoperation.crud.modelClass.Registration;
import com.crudoperation.crud.repository.JpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Studentservice {
    @Autowired
    JpaRepo jpa;
    public Registration addData(Registration regi)
    {
        return this.jpa.save(regi);
    }
    public List<Registration> getAllRecords()
    {
        return this.jpa.findAll();
    }
    public Optional<Registration> getParticularRecord(Integer id)
    {
        return this.jpa.findById(id);
    }
    public Registration updateRecord(Integer id,Registration regi)
    {
        Registration oldRecords=this.jpa.findById(id).orElseThrow(()->new ResourceNotFoundException("User Data not available"));
         oldRecords.setStu_name(regi.getStu_name());
        oldRecords.setDept(regi.getDept());
        oldRecords.setAddress(regi.getAddress());
         //oldRecords.setStu_id(regi.getStu_id());


        return this.jpa.save(oldRecords);
    }
    public String deleteRecord(Integer id)
    {
        this.jpa.deleteById(id);
        return "Succesfully deleted";
    }




}

