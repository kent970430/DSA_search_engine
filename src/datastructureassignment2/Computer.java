/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructureassignment2;

import java.util.Objects;

/**
 *
 * @author DELL
 */
public class Computer implements Comparable<Computer> {

    private String deviceID;
    private String processor;
    private String ram;
    private String os;
    private Lab labb;

    Computer() {

    }

    public Computer(String deviceID, String processor, String ram, String os, Lab labb) {
        this.deviceID = deviceID;
        this.processor = processor;
        this.ram = ram;
        this.os = os;
        this.labb = labb;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Lab getLabb() {
        return labb;
    }

    public void setLabb(Lab labb) {
        this.labb = labb;
    }

    public String toString() {
        return deviceID + "," + processor + "," + ram + "," + os + "," + labb;
    }

    public int compareTo(Computer c2) {
        int result = labb.compareTo(c2.labb);
        // if last names are equal, check first names
        if (result == 0) {
            result = deviceID.compareTo(c2.deviceID);
        }
        return result;
        //return deviceID.compareTo(c2.deviceID);
    }   

}
