package com.fafa.domain;

import java.util.Date;

public class Student {
    private String studentId;

    private String studentName;

    private String studentGender;

    private Date studentBirthday;

    private String classId;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender == null ? null : studentGender.trim();
    }

    public Date getStudentBirthday() {
        return studentBirthday;
    }

    public void setStudentBirthday(Date studentBirthday) {
        this.studentBirthday = studentBirthday;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
    }
    @Override
    public String toString() {
        return "User [学号=" + studentId + ", 姓名=" + studentName 
                + ", 性别=" + studentGender + ", 生日=" + studentBirthday  
                + ", 班级=" + classId + "]";
    }
}