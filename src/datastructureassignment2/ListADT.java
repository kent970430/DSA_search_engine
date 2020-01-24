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
public interface ListADT<T> {

    public void add(T data);

    /*
    Description     : add new data into the list
    Precondition    : data cannot be null
    Postcondition   : the data is added into the list
    Return          : none
     */
    public void remove(String data);

    /*
    Description     : remove a data from the list
    Precondition    : data cannot be null, list cannot be bull
    Postcondition   : data is remove from the list
    Return          : none
     */
    public T removeFront();

    /*
    Description     : remove the first item in the list
    Precondition    : list is not empty
    Postcondition   : first item is remove, the size is reduce
    Return          : first item
     */
    public T removeBack();
    /*
    Description     : remove the last item in the list
    Precondition    : list is not empty
    Postcondition   : last item is remove, the size is reduce
    Return          : last item
     */
    public void showAll();
    /*
    Description     : show all item in the list
    Precondition    : list is not empty
    Postcondition   : none
    Return          : none
     */
    public boolean containz(String data);
    /*
    Description     : check the item contain inside the list or not
    Precondition    : list is not empty, data is not null
    Postcondition   : none
    Return          : true if item contain in list else return false
     */ 
    public String search(String data);
    /*
    Description     : search the item inside the list
    Precondition    : list is not empty, data is not null
    Postcondition   : none
    Return          : return the search result
     */ 
    
}
