/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructureassignment2;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author justd
 */
public class Database {
    public ArrayList<Student> studentList;
    public ArrayList<Admin> adminList;
    public ArrayList<User> userList;
    public static ArrayList<Student> student;
    
    
    public ArrayList<Student> getStudent() {
        return studentList;
    }
    
    public ArrayList<Admin> getAdmin() {
        return adminList;
    }
    
    public ArrayList<User> getUser() {
        return userList;
    }
    
    public void addStudent() {
        studentList = new ArrayList<Student>();
        try {
            Student a = new Student("1805445", "TEE", "970430", "0123456789", "wangsa", "TEE@gmail.com", "1805445", "tee123");
            Student a1 = new Student("1805446", "TE", "970430", "0123456789", "wangsa", "TEE@gmail.com", "1805446", "tee1234");
            studentList.add(a);
            studentList.add(a1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Student Error");
        }
    }
    
    public void addAdmin() {
        adminList = new ArrayList<Admin>();
        try {
            Admin b = new Admin("100001", "100001", "qwe123");
            Admin b1 = new Admin("100002", "100002", "qwe1234");
            adminList.add(b);
            adminList.add(b1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Admin Error");
        }
    }
    
    public void getAllData() {
        //Array has fix length and need to define the size of array whereas ArrayList doesn't need to bother about the length and no need define
        addStudent();
        addAdmin();
        
    }
    
    
}
