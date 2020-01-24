/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructureassignment2;

/**
 *
 * @author User
 * @param <T>
 */
public class Check<T extends Comparable<? super T>> implements ListtADT<T> {

    private T[] list; 
  int size;
  
    
    public static String duplicate;

    public Check(){
    list = (T[]) new Comparable[1000];
    
    }

    public void add(T newEntry) {
    if (isArrayFull()) {
      extendsArray();
    }

    list[size] = newEntry;
    size++;
    
  }
    
    private boolean isArrayFull() {
    return size == list.length;
  }
     
     private void extendsArray() {
    T[] oldList = list; 
    int oldSize = oldList.length;    

    list = (T[]) new Object[2 * oldSize];  

    // copy entries from old array to new, bigger array
    for (int index = 0; index < oldSize; index++) {
      list[index] = oldList[index];
    }
  } 
     
     
    public T get(int givenPosition ){
        T result = null;

    if ((givenPosition >= 0) && (givenPosition <= size)) {
      result = list[givenPosition ];
    }

    return result;
        
    }
    
    public ListtADT checkDuplicate(){
        Check item = new Check();
        T buffer = null;
        int counter= 0;
        
        for(int i=0;i < size;i++){
            if(buffer == null||this.list[i].compareTo(buffer )!= 0){
                buffer = this.list[i];
                counter =1;
            }
            else{
                counter++;
                if (counter ==2){
                    item.add(buffer);
                }
            }
        }
        
        return item;
    }

     public T remove(int i){
              T item = null;
        
        item = list[i];
        
        shiftItemtoLeft(i);
        size--;
        
        return item;
     }

          private void shiftItemtoLeft(int currentIndex) {
        for (int i = currentIndex; i < size - 1; i++) {
            list[i] = list[i + 1];
        }
        list[size - 1] = null;
    }

}
