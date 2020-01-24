/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructureassignment2;

/**
 *
 * @author Admin
 */
public class software implements Comparable<software> {

    private String softwareName;
    private String labid;
    private String block;
    private String level;
    private String comid;

    public software() {

    }

    public software(String softwareName, String labid, String block, String level, String comid) {
        this.softwareName = softwareName;
        this.labid = labid;
        this.block = block;
        this.level = level;
        this.comid = comid;
    }

    public int compareTo(software s2) {
        return softwareName.compareTo(s2.softwareName);
    }

    public String toString() {
        String str = "";
        str = softwareName + "," + labid + "," + block + "," + level + "," + comid + "";
        return str;
    }

    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }

    public String getLabid() {
        return labid;
    }

    public void setLabid(String labid) {
        this.labid = labid;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getComid() {
        return comid;
    }

    public void setComid(String comid) {
        this.comid = comid;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

}
