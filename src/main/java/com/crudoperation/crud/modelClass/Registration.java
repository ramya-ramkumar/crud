package com.crudoperation.crud.modelClass;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@Table(name="StudentRegistration")
public class Registration {


    public String getAddress() {
        return address;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "studentId")
    private int stu_id;
    @Column(name = "studentName")
    private String stu_name;
    @Column(name = "studentDept")
    private String Dept;
    @Column(name = "studentAddress")
    private String address;
}
