package com.springbootwithjdbc.dto;

public class EmployeeDto {

    private int id;
    private String fname;
    private String lname;
    private String position;

    public EmployeeDto(int id, String fname, String lname, String position) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.position = position;
    }

    public EmployeeDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
