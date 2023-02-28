package com.student.studentManagementSystem;

public class Student{
    private String name;
    private int age;
    private int admnNo ;
    private String branch;

    public Student(String name, int age, int admnNo, String branch) {

        this.name = name;
        this.age = age;
        this.admnNo = admnNo;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAdmnNo() {
        return admnNo;
    }

    public void setAdmnNo(int admnNo) {
        this.admnNo = admnNo;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch =branch;

    }
}