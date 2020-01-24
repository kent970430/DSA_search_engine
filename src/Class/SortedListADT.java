/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author justd
 */
public interface SortedListADT<T> {

    public void add(T data);

    /*
    description: to add data to the list in ascending order
    precondition：data is not null   
    postcondition: data is added to the list
    return: none
     */
    public String search(String specc);

    /*
    description: to search the spec
    precondition：data is not null   
    postcondition: none
    return: return spec
     */
    public int getLength();

    /*
    description: get the length of the node
    precondition： none
    postcondition: none
    return: return length
     */
    public T getEntry(int givenPosition);

    /*
    description: get the entry of the node
    precondition： 
    postcondition: 
    return: return entry
     */
    public int getPosition(T anEntry);

    /*
    description: Gets the position of an entry in the sorted list
    precondition：none
    postcondition: none
    return: the position of the first or only occurrence of anEntry if it
     */
    public String count(String specc);

    /*
    description: get the count
    precondition：count is not null
    postcondition: none
    return: count
     */
    public boolean containz(String data);

    /*
    Description     : check the item contain inside the list or not
    Precondition    : list is not empty, data is not null
    Postcondition   : none
    Return          : true if item contain in list else return false
     */
    public void remove(String data);

    /*
    Description     : remove a data from the list
    Precondition    : data cannot be null, list cannot be bull
    Postcondition   : data is remove from the list
    Return          : none
     */
    public String searchz(String data);
    /*
    Description     : search the item inside the list
    Precondition    : list is not empty, data is not null
    Postcondition   : none
    Return          : return the search result
     */
}
