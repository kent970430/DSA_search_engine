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
public class software_node_linked_list<T extends Comparable <T>> implements software_node_list<T> {
    
    private Node firstNode;
    private Node lastNode;
    private int sizeofNode;
    
    public software_node_linked_list(){
        
    }
    
    public software_node_linked_list(Node firstNode, Node lastNode, int sizeofNode){
        firstNode = null;
        lastNode = null;
        sizeofNode = 0;
    }
    
    public void add_software (T data){
       if (data != null){
           Node newnode = new Node(data);
           
           if(firstNode == null){
               firstNode = newnode;
           } else {
               if(data.compareTo(firstNode.data) < 0){
                   newnode.next = firstNode;
                   firstNode = newnode;
               }else if(data.compareTo(firstNode.data) > 0){
                   Node current = firstNode;
                   Node previous = null;
                   
                   while(current != null && data.compareTo(current.data)>0){
                       previous = current;
                       current = current.next;
                   }
                   
                   previous.next = newnode;
                   newnode.next = current;
                   
               } else if (data.compareTo(firstNode.data) == 0){
                   Node current = firstNode;
                   Node previous = null;
                   
                   while(current != null && data.compareTo(current.data)==0){
                       previous = current;
                       current = current.next;
                   }
                   
                   previous.next = newnode;
                   newnode.next = current;
               }
           }
       }
       
   }
    
    public String search_software(String data){
       Node current = firstNode;
       String str = "";
       int count = 0;
       while(current != null){
           if(current.data instanceof software){
               software soft = (software)current.data;
               if(soft.getSoftwareName().equals(data)){
                   
                   str = str + soft.getSoftwareName() + "," + soft.getLabid() + "," + soft.getBlock() + "," + soft.getLevel() + "," + soft.getComid() + ",";
                   
                   count++;
               }
               
           }
           
           current = current.next;
           
       }
       if (count <= 0) {
            str = "Software not found";
        }
       return str;
   }
    
    public String count(String data){
       Node current = firstNode;
       String str = "";
       int count = 0;
       while(current != null){
           if(current.data instanceof software){
               software soft = (software)current.data;
               if(soft.getSoftwareName().equals(data)){
                   
                   str = str + soft.getSoftwareName() + "," + soft.getLabid() + "," + soft.getBlock() + "," + soft.getLevel() + "," + soft.getComid() + ",";
                   
                   count++;
               }
               
               
               
           }
           
           current = current.next;
           
       }
       if (count <= 0) {
            str = "Software not found";
        }
       return Integer.toString(count);
   }
    
    public void clear_software(){
        firstNode = null;
        lastNode = null;
        sizeofNode = 0;
    }
    
    public boolean isEmpty(){
          if(firstNode == null)
              return true;
          else
              return false;
    }

     public String toString (){
        String str = "";
        Node current = firstNode;
        while (current != null){
            str = str + current.data.toString() + " ";
            current = current.next;
        }
        
        return str;
    }
    
    class Node {
        private T data;
        private Node next;
        
        public Node(T data) {
            this.data = data;
        }
        
        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }
    
}
