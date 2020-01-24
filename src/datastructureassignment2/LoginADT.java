/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructureassignment2;

/**
 *
 * @author justd
 */
public interface LoginADT {
    String getUsername();
    void setUsername(String username);
    String getPassword();
    void setPassword(String password);
    
    public void loginn(String username, String password, String cmb);
    
    public int getFlag();
    /*
    Description: return the flag
    Precondition: login function must return flag
    Post condition: flag updated
    Return: the flag
    */
    
}
