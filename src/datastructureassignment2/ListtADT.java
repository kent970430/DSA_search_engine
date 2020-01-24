/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructureassignment2;

/**
 *
 * @author User
 */
public interface ListtADT<T> {

    public void add(T data);

    /*
    Description     : to add item into the list
    Precondition    : item is not null
    Postcondition   : item is added to the list
    Return          : none
     */

    public ListtADT checkDuplicate();

    /*
    Description: To check for duplicates and return them.
    Precondition    : item is not null
    Postcondition   : none
    Return          : return item   
    
     */
    public T get(int i);

    /*
    Description: To get an item at the specified index in the list without removing it
    Precondition: None
    Postcondition: None
    Return: The item at the specified index
     */

    public T remove(int i);
    /*
    Description: To remove an item at the specified index in the list
    Precondition: None
    Postcondition: The specified index of the item is removed from the list, size is reduced
    Return: return item
     */
}
