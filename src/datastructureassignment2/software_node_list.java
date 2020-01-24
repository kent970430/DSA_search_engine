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
public interface software_node_list<T> {

    public void add_software (T data);
    /*
    Description     : add data to the front
    Precondition    : the data is not null
    Postcondition   : the data is added to the first of deque
    Return          : None
    */
    
    public void clear_software();
    /*
    Description     : clear the deque
    Precondition    : none
    Postcondition   : the deque is empty
    Return          : none
    */
    
    public String search_software(String data);
    /*
    Description     : search the specific software
    Precondition    : the software is exits
    Postcondition   : none
    Return          : return the specific software
    */
    
    public String count(String data);
    /*
    Description     : get the counter
    Precondition    : none
    Postcondition   : none
    Return          : the number of counter
    */
}
