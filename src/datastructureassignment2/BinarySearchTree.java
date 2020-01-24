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
import static datastructureassignment2.DataStructureAssignment20.lll;

public class BinarySearchTree<T extends Comparable<T>> implements TreeADT<T> {

    private TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public BinarySearchTree(T data) {
        root = new TreeNode(data);
    }

    public T add(T newEntry) {
        T current = null;

        if (root == null) {
            root = new TreeNode(newEntry);
        } else {
            current = addEntry(root, newEntry);
        }
        return current;
    }

    private T addEntry(TreeNode root, T newEntry) {
        T current = null;
        if (newEntry.compareTo(root.data) == 0) {
            current = root.data;
            root.data = newEntry;
        } else if (newEntry.compareTo(root.data) < 0) {
            if (root.left == null) {
                root.left = new TreeNode(newEntry);
            } else {
                current = addEntry(root.left, newEntry);
            }
        } else {
            if (root.right == null) {
                root.right = new TreeNode(newEntry);
            } else {
                current = addEntry(root.right, newEntry);
            }
        }
        return current;
    }

    public void displayy() {
        displayRec(root);
    }

    public void displayRec(TreeNode root) {
        if (root != null) {
            displayRec(root.left);
            System.out.println(root.data);
            displayRec(root.right);
        }
    }

    public String search(String entry) {
        return findSearch(root, entry);
    }

    private String findSearch(TreeNode rootNode, String data) {
        if (rootNode != null) {
            if (rootNode.data instanceof Lab) {
                Lab ll = (Lab) rootNode.data;
                if (ll.getLabID().compareTo(data) == 0) {
                    lll.setLabID(ll.getLabID());
                    lll.setBlock(ll.getBlock());
                    lll.setLevel(ll.getLevel());
                    lll.setLabSpecification(ll.getLabSpecification());
                    lll.setLabCapacity(ll.getLabCapacity());
                    return ll.toString();
                } else if (data.compareTo(rootNode.data.toString()) > 0) {
                    return findSearch(rootNode.right, data);
                } else {
                    return findSearch(rootNode.left, data);
                }
            }
        }
        return "Lab not found";
    }

    public void clear() {
        root = null;
    }

    public boolean containz(String data) {
        if(data != null){
        return findContainz(root, data) != null;
        }else{
            return false;
        }
    }

    private String findContainz(TreeNode rootNode, String data) {
        String result = null;
        if (rootNode != null) {
            if (rootNode.data instanceof Lab) {
                Lab ll = (Lab) rootNode.data;
                if (ll.getLabID().compareTo(data) == 0) {
                    result = ll.getLabID();
                    return result;
                } else if (data.compareTo(rootNode.data.toString()) < 0) {
                    result = findContainz(rootNode.left, data);
                } else {
                    result = findContainz(rootNode.right, data);
                }
            }
        }
        return result;
    }

    public void remove(String data) {
        root = deleteDataa(root, data);
    }

    private TreeNode deleteDataa(TreeNode rootNode, String data) {
        if (rootNode == null) {
            return root;
        } else {
            if (rootNode.data instanceof Lab) {
                Lab ll = (Lab) rootNode.data;
                if (ll.getLabID().compareTo(data) < 0) { //rootNode lab id is smaller than user inputttt
                    rootNode.right = deleteDataa(rootNode.right, data);
                } else if (ll.getLabID().compareTo(data) > 0) {  //rootNode lab id is bigger than the user input
                    rootNode.left = deleteDataa(rootNode.left, data);
                } else {
                    if (rootNode.left == null) {
                        return rootNode.right;
                    } else if (rootNode.right == null) {
                        return rootNode.left;
                    }
                    rootNode.data = smallestt(rootNode.right);
                    rootNode.right = deleteDataa(rootNode.right, rootNode.data.toString());
                }
            }
        }
        return rootNode;
    }

    private T smallestt(TreeNode rootNodee) {
        T small = rootNodee.data;
        while (rootNodee.left != null) {
            small = rootNodee.left.data;
            rootNodee = rootNodee.left;
        }
        return small;
    }

    private class TreeNode {

        private T data;
        private TreeNode left, right;

        private TreeNode() {
            left = null;
            right = null;
        }

        private TreeNode(T data) {
            this(data, null, null);
        }

        private TreeNode(T data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        private boolean isLeaf() {
            return (left == null) && (right == null);
        }
    }
}
