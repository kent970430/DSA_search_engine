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
import static datastructureassignment2.DataStructureAssignment20.compp;

public class LinkedList<T extends Comparable<T>> implements ListADT<T> {

    private Node firstNode;
    private Node lastNode;
    private int size;

    public LinkedList() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    public void add(T data) {
        Node newNode = new Node(data);
        if (firstNode != null) {
            lastNode.next = newNode;
            lastNode = newNode;
        } else {
            firstNode = newNode;
            lastNode = newNode;
        }
        size++;
    }

    public void remove(String data) {
        Node item = null;
        Node temp = firstNode;

        if (temp != null) {
            if (temp.data instanceof Computer) {
                Computer comp = (Computer) temp.data;
                if (comp.getDeviceID().compareTo(data) == 0) {
                    firstNode = temp.next;
                    return;
                } else if (temp == null) {
                    return;
                } else {
                    item = temp;
                    temp = temp.next;
                }
                item.next = temp.next;
            }
        }
    }

    public T removeFront() {
        T item = null;
        if (firstNode != null) {
            item = firstNode.data;
            if (firstNode.next != null) {
                Node second = firstNode.next;
                firstNode.next = null;
                firstNode = second;
            } else {
                firstNode = null;
                lastNode = null;
            }
            size--;
        }
        return item;
    }

    public T removeBack() {
        T item = null;
        if (firstNode != null) {
            item = lastNode.data;
            if (firstNode.next == null) {
                firstNode = null;
                lastNode = null;
            } else {
                Node current = firstNode;
                while (current.next != lastNode) {
                    current = current.next;
                }
                current.next = null;
                lastNode = current;
            }
            size--;
        }
        return item;
    }

    public void showAll() {
        Node fnode = firstNode;
        while (fnode != null) {
            System.out.print(fnode.data + " ");
            fnode = fnode.next;
        }
    }

    public boolean containz(String data) {
        if (data != null) {
            return findContainz(firstNode, data) != null;
        } else {
            return false;
        }
    }

    private String findContainz(Node firstNode, String data) {
        String result = null;
        if (firstNode != null) {
            if (firstNode.data instanceof Computer) {
                Computer compp = (Computer) firstNode.data;
                if (compp.getDeviceID().compareTo(data) == 0) {
                    result = compp.getDeviceID();
                    return result;
                } else {
                    result = findContainz(firstNode.next, data);
                }
            }
        }
        return result;
    }

    public String search(String data) {
        Node current = firstNode;
        String str = "";
        int count = 0;
        while (current != null) {
            if (current.data instanceof Computer) {
                Computer compptr = (Computer) current.data;
                if (compptr.getDeviceID().equals(data)) {
                    compp.setDeviceID(compptr.getDeviceID());
                    compp.setProcessor(compptr.getProcessor());
                    compp.setRam(compptr.getRam());
                    compp.setOs(compptr.getOs());
                    compp.setLabb(compptr.getLabb());
                    str = compp.toString();
                    count++;
                }
            }
            current = current.next;
        }
        if (count <= 0) {
            str = "Computer not found";
        }
        return str;
    }

//    private String findSearch(Node firstNode, String data) {
//        String result = null;
//        if (firstNode != null) {
//            if (firstNode.data instanceof Computer) {
//                Computer compptr = (Computer) firstNode.data;
//                if (compptr.getDeviceID().compareTo(data) == 0) {
//                    compp.setDeviceID(compptr.getDeviceID());
//                    compp.setProcessor(compptr.getProcessor());
//                    compp.setRam(compptr.getRam());
//                    compp.setOs(compptr.getOs());
//                    compp.setVersion(compptr.getVersion());
//                    compp.setManufacturer(compptr.getManufacturer());
//                    compp.setSystem(compptr.getSystem());
//                    compp.setLabb(compptr.getLabb());
//                    result = compp.toString();
//                    return result;
//                } else {
//                    result = findContainz(firstNode.next, data);
//                }
//            }
//        }
//        return "Computer not found";
//    }

    public class Node {

        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
            next = null;
        }

    }

}
