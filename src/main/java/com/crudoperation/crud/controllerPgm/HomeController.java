package com.crudoperation.crud.controllerPgm;

import com.crudoperation.crud.modelClass.Registration;
import com.crudoperation.crud.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/homepage")
public class HomeController {
    @Autowired
    Studentservice studentservice;
    @PostMapping("/registration")
    public Registration addvalues(@RequestBody Registration regi)
    {
        return this.studentservice.addData(regi);
    }
    @GetMapping("/getRecords")
    public List<Registration> getData()
    {
return  this.studentservice.getAllRecords();
    }
    @GetMapping("/particularRecords/{id}")
    public Optional<Registration> getParticularRecords(@PathVariable(value="id")Integer id)
    {
     return this.studentservice.getParticularRecord(id);
    }
//
//    @PutMapping("/updateRecords/{id}")
//    public  Registration updateRecords(@RequestBody Registration regi) {
//        return updateRecords(null);
//    }

    @PutMapping("/updateRecords/{id}")
    public  Registration updateRecord(@PathVariable(value = "id")Integer id, @RequestBody Registration regi)

    {
        return  this.studentservice.updateRecord(id,regi);
    }
    @DeleteMapping("/deleteRecord/{id}")
    public String deleterec(@PathVariable(value = "id")Integer id)
  //  public Optional<Registration> getParticularRecords(@PathVariable(value="id")Integer id)
    {
       return this.studentservice.deleteRecord(id);
    }
}
