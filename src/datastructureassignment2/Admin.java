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
public class Admin{

    static ArrayList<Admin> getAdmin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String StaffID;
    private String StaffUsn;
    private String StaffPwd;

    Admin(){
        
    }
    
    Admin(String StaffID, String StaffUsn, String StaffPwd) {
        this.StaffID = StaffID;
        this.StaffUsn = StaffUsn;
        this.StaffPwd = StaffPwd;
    }

    public String getStaffID() {
        return StaffID;
    }

    public void setStaffID(String StaffID) {
        this.StaffID = StaffID;
    }

    public String getStaffUsn() {
        return StaffUsn;
    }

    public void setStaffUsn(String StaffUsn) {
        this.StaffUsn = StaffUsn;
    }

    public String getStaffPwd() {
        return StaffPwd;
    }

    public void setStaffPwd(String StaffPwd) {
        this.StaffPwd = StaffPwd;
    }

    
    
    
}
