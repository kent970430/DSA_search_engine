/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructureassignment2;

/**
 *
 * @author DELL
 */
public class Lab implements Comparable<Lab>{
    private String labID;
    private String block;
    private int level;
    private String labSpecification;
    private int labCapacity;

    Lab() {

    }

    public Lab(String labID, String block, int level, String labSpecification, int labCapacity) {
        this.labID = labID;
        this.block = block;
        this.level = level;
        this.labSpecification = labSpecification;
        this.labCapacity = labCapacity;
    }

    public String getLabID() {
        return labID;
    }

    public void setLabID(String labID) {
        this.labID = labID;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getLabSpecification() {
        return labSpecification;
    }

    public void setLabSpecification(String labSpecification) {
        this.labSpecification = labSpecification;
    }

    public int getLabCapacity() {
        return labCapacity;
    }

    public void setLabCapacity(int labCapacity) {
        //labCapacity += 1;
        this.labCapacity = labCapacity;
    }
    

    public int compareTo(Lab l2) {
        return labID.compareTo(l2.labID);
    }

    public String toString() {
        String str = "";
        str = labID + "," + block + "," + level + "," + labSpecification + "," + labCapacity + "\n";
        return str;
    }

}
