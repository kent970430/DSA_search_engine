/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructureassignment2;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Student{

    static ArrayList<Student> getStudent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String studentID;
    private String studentName;
    private String studentIC;
    private String studentPhone;
    private String studentAddress;
    private String studentEmail;
    private String studentUsn;
    private String studentPwd;

    Student(){
        
    }
    
    Student(String studentID, String studentName, String studentIC, String studentPhone, String studentAddress, String studentEmail, String studentUsn, String studentPwd) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentIC = studentIC;
        this.studentPhone = studentPhone;
        this.studentAddress = studentAddress;
        this.studentEmail = studentEmail;
        this.studentUsn = studentUsn;
        this.studentPwd = studentPwd;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentIC() {
        return studentIC;
    }

    public void setStudentIC(String studentIC) {
        this.studentIC = studentIC;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentUsn() {
        return studentUsn;
    }

    public void setStudentUsn(String studentUsn) {
        this.studentUsn = studentUsn;
    }

    public String getStudentPwd() {
        return studentPwd;
    }

    public void setStudentPwd(String studentPwd) {
        this.studentPwd = studentPwd;
    }

    //public

   
}
