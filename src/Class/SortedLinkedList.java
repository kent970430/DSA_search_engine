/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;
//import static datastructureassignment2.DataStructureAssignment20.lll;

import datastructureassignment2.Computer;
import static datastructureassignment2.DataStructureAssignment20.compp;

/**
 *
 * @author justd
 */
public class SortedLinkedList<T extends Comparable<T>> implements SortedListADT<T> {

    private Node firstNode;
    private int length;

    public SortedLinkedList() {
        firstNode = null;
        length = 0;
    }

    private class Node {

        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
        }
    }

    public void add(T data) {
        if (data != null) {
            Node newNode = new Node(data);

            if (firstNode == null) {
                firstNode = newNode;
            } else {
                if (data.compareTo(firstNode.data) < 0) {
                    newNode.next = firstNode;
                    firstNode = newNode;
                } else {
                    Node current = firstNode;
                    Node previous = null;

                    while (current != null && data.compareTo(current.data) > 0) {
                        previous = current;
                        current = current.next;
                    }
                    previous.next = newNode;
                    newNode.next = current;
                }
            }
            length++;
        }

    }

    public int getLength() {
        return length;
    }

    public int getPosition(T anEntry) {
        int position = 1;

        while ((position <= length) && (anEntry.compareTo(getEntry(position)) > 0)) {
            position++;
        } // end while

        if ((position > length) || !anEntry.equals(getEntry(position))) {
            position = -position;
        } // end if

        return position;
    }

    public String search(String specc) {
        SortedLinkedList.Node current = firstNode;
        String str = "";
        int count = 0;
        while (current != null) {
            if (current.data instanceof Computer) {
                Computer g = (Computer) current.data;
                if (g.getProcessor().compareTo(specc) == 0) {
                    compp.setLabb(g.getLabb());
                    compp.setDeviceID(g.getDeviceID());
                    compp.setProcessor(g.getProcessor());
                    compp.setRam(g.getRam());
                    compp.setOs(g.getOs());
                    count++;
                    str += g.toString() + "";
                } else if (g.getRam().compareTo(specc) == 0) {
                    compp.setLabb(g.getLabb());
                    compp.setDeviceID(g.getDeviceID());
                    compp.setProcessor(g.getProcessor());
                    compp.setRam(g.getRam());
                    compp.setOs(g.getOs());
                    count++;
                    str += g.toString() + "";
                } else if (g.getOs().compareTo(specc) == 0) {
                    compp.setLabb(g.getLabb());
                    compp.setDeviceID(g.getDeviceID());
                    compp.setProcessor(g.getProcessor());
                    compp.setRam(g.getRam());
                    compp.setOs(g.getOs());
                    count++;
                    str += g.toString() + "";

                }
                current = current.next;
            }

        }
        if (count <= 0) {
            str = "Spec not found";
        }
        return str;
    }

    public T getEntry(int givenPosition) {
        T result = null;

        if ((givenPosition >= 1) && (givenPosition <= length)) {
            Node currentNode = firstNode;
            for (int i = 0; i < givenPosition - 1; ++i) {
                currentNode = currentNode.next;		// advance currentNode to next node
            }
            result = currentNode.data;	// currentNode is pointing to the node at givenPosition
        }

        return result;
    }

    public String toString() {
        String strr = "";
        Node current = firstNode;
        while (current != null) {
            strr += current.data + "\n";;
            current = current.next;
        }
        return strr;
    }

    public String count(String specc) {
        Node current = firstNode;
        String str = "";
        int count = 0;
        while (current != null) {
            if (current.data instanceof Computer) {
                Computer g = (Computer) current.data;
                if (g.getProcessor().equals(specc)) {
                    compp.setLabb(g.getLabb());
                    compp.setDeviceID(g.getDeviceID());
                    compp.setProcessor(g.getProcessor());
                    compp.setRam(g.getRam());
                    compp.setOs(g.getOs());
                    count++;
                    str += g.toString() + "";
                } else if (g.getRam().equals(specc)) {
                    compp.setLabb(g.getLabb());
                    compp.setDeviceID(g.getDeviceID());
                    compp.setProcessor(g.getProcessor());
                    compp.setRam(g.getRam());
                    compp.setOs(g.getOs());
                    count++;
                    str += g.toString() + "";
                } else if (g.getOs().equals(specc)) {
                    compp.setLabb(g.getLabb());
                    compp.setDeviceID(g.getDeviceID());
                    compp.setProcessor(g.getProcessor());
                    compp.setRam(g.getRam());
                    compp.setOs(g.getOs());
                    count++;
                    str += g.toString() + "";
                }
                current = current.next;
            }
        }
        if (count <= 0) {
            str = "Spec not found";
        }
        return Integer.toString(count);
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

    public String searchz(String data) {
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

}
