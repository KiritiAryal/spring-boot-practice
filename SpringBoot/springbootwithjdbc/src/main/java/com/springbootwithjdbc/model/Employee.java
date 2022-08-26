package com.springbootwithjdbc.model;

//import javax.persistence.*;

//@Entity
//@Table(name = "employee_tb")
//public class Employee {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    private String fname;
//    private String lname;
//    private String position;
//
//    public Employee(int id, String fname, String lname, String position) {
//        this.id = id;
//        this.fname = fname;
//        this.lname = lname;
//        this.position = position;
//    }
//
//    public Employee() {
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getFname() {
//        return fname;
//    }
//
//    public void setFname(String fname) {
//        this.fname = fname;
//    }
//
//    public String getLname() {
//        return lname;
//    }
//
//    public void setLname(String lname) {
//        this.lname = lname;
//    }
//
//    public String getPosition() {
//        return position;
//    }
//
//    public void setPosition(String position) {
//        this.position = position;
//    }
//}

import javax.persistence.*;

@Entity
@Table(name= "employee")
public class Employee{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String firstName;
    public String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
