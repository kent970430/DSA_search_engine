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
import Class.SortedLinkedList;
import Class.SortedListADT;


public class DataStructureAssignment20 {

    /**
     * @param args the command line arguments
     */
    public static TreeADT<Lab> bst = new BinarySearchTree();
    public static Lab lll = new Lab();
    public static Computer compp = new Computer();
    public static SortedListADT<Computer> searchh = new SortedLinkedList();
    

    public static void main(String[] args) {
        Lab oo = new Lab("B105", "B", 2, "Gaming Lab", 25);
        Lab o1 = new Lab("B101", "B", 1, "Network", 20);
        Lab o2 = new Lab("B104", "B", 1, "Gaming Lab", 30);
        Lab o3 = new Lab("B102", "B", 1, "Data Structure", 20);
        Lab o4 = new Lab("B103", "B", 1, "Web Application", 20);
        Lab o5 = new Lab("D301", "D", 3, "Data Structure", 25);
        bst.add(oo);
        bst.add(o1);
        bst.add(o2);
        bst.add(o3);
        bst.add(o4);
        bst.add(o5);       
        searchh.add(new Computer("1001", "Intel Core i7 970", "32 GigaByte", "Windows 10 Education",o1));
        searchh.add(new Computer("1002", "Intel Core i7 960", "32 GigaByte", "Windows 8 Education",o1));
        searchh.add(new Computer("1001", "Intel Core i7 950", "64 GigaByte", "Windows 8 Education",o3));
        searchh.add(new Computer("1002", "Intel Core i7 980", "32 GigaByte", "Windows 8 Education",o3));
        searchh.add(new Computer("1001", "Intel Core i7 970", "32 GigaByte", "Windows 8 Education",o4));
        searchh.add(new Computer("1002", "Intel Core i7 960", "64 GigaByte", "Windows 10 Education",o4));
        searchh.add(new Computer("1003", "Intel Core i7 960", "64 GigaByte", "Windows 10 Education",o4));
        
        
//        comppList.add(new Computer("1001", "Intel Core i7 950", "32 GigaByte", "Windows 8 Education",o1));
//        comppList.add(new Computer("1001", "Intel Core i7 970", "32 GigaByte", "Windows 8 Education",o1));
//        comppList.add(new Computer("1001", "Intel Core i7 970", "32 GigaByte", "Windows 10 Education",o1));
//        
//        comppList.add(new Computer("1002", "Intel Core i7 960", "32 GigaByte", "Windows 8 Education",o1));
//        comppList.add(new Computer("1002", "Intel Core i7 980", "32 GigaByte", "Windows 8 Education",o1));
//        comppList.add(new Computer("1002", "Intel Core i7 960", "64 GigaByte", "Windows 10 Education",o1));
//        
//        comppList.add(new Computer("1003", "Intel Core i7 960", "64 GigaByte", "Windows 10 Education",o4));

        Frame_Login fl = new Frame_Login();
        fl.setVisible(true);
    }

}
