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
public interface TreeADT<T> {

    public T add(T newEntry);
    /*
    Description     : add new node into the tree
    Precondition    : entry cannot be null
    Postcondition   : the node is added into the tree
    Return          : none
     */
    public void remove(String entry);

    /*
    Description     : remove the node in the tree
    Precondition    : node cannot be empty, tree cannot be empty
    Postcondition   : node is remove from the tree
    Return          : none
     */
    public void clear();

    /*
    Description     : clear all node inside the tree
    Precondition    : none
    Postcondition   : the tree is empty
    Return          : none
     */
    public boolean containz(String data);

    /*
    Description     : check the user input is in the tree
    Precondition    : user input cannot be null
    Postcondition   : none
    Return          : true if user input found else return false
     */
    public String search(String entry);
    /*
    Description     : Search for the user input in the tree
    Precondition    : user input cannot be null, tree cannot be null
    Postcondition   : none
    Return          : return the result to the user
     */
    public void displayy();
    /*
    Description     : show all of the node in the tree
    Precondition    : root cannot be null
    Postcondition   : none
    Return          : display all node
     */
}
