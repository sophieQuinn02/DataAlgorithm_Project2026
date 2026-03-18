/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seagulldockapp;

/**
 *
 * @author Sophie Quinn
 */
//this is the entire singly-linked list for the Herring Gull,
//code was taken and modified from Hamilton Niculescu's code 
//available on NCI Moodle, Data Structures & Algorithms module, 2026
public class HerringGullSSL implements GullListInterface {
    
    public HerringGullSSL(){
        head = null;
        iSize = 0;
        currNode = null;
        prevNode = null;
    }

    public class GlNode {

    private Object element;
    private GlNode next;

    public GlNode(Object inElement, GlNode inNode) {
        element = inElement;
        next = inNode;
    }

    public GlNode getNext() {
        return next;
    }

    public void setNext(GlNode inNode) {
        next = inNode;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object inElement) {
        element = inElement;
    }

    @Override
    public String toString() {
        return element.toString();
    }
}
    private GlNode head;
    private int iSize;
    private GlNode currNode;
    private GlNode prevNode;


    @Override
    public boolean isEmpty() {
        if (iSize == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return iSize;
    }

    //add an element to the list, assume the iPosition is in the correct range
    @Override
    public void add(int iPosition, Object theElement) {
        //special case of adding at the head of the list (on the first position)
        if (iPosition == 1) {
            GlNode newNode = new GlNode(theElement, head);
            head = newNode;
        } else {
            setCurrent(iPosition);
            GlNode newNode = new GlNode(theElement, currNode);
            prevNode.setNext(newNode);
        }
        //as a new one was added the size counter must be incremented by 1
        iSize = iSize + 1;
    }

    //add an element at the end of the list (on the last position)
    @Override
    public void add(Object theElement) {
        GlNode newNode = new GlNode(theElement, null);
        if (head == null) {
            head = newNode;
        } else {
            setCurrent(iSize);
            currNode.setNext(newNode);
        }
        iSize = iSize + 1;
    }

    @Override
    public Object get(int iPosition) {
        setCurrent(iPosition);
        return currNode;
    }

    @Override
    public void remove(int iPosition) {
        // special case for removing the head of the list / first node.
        if (iPosition == 1) {
            head = head.getNext();
        } else {
            // find the previous and current nodes
            setCurrent(iPosition);
            prevNode.setNext(currNode.getNext());
        }
        // as one node was removed the size counter must be decremented by 1
        iSize = iSize - 1;
    }

    private void setCurrent(int iPosition) {
        // sets currNode to the node at position specified by index
        // sets prevNode to the node previous to currNode
        int iCount;
        prevNode = null;
        currNode = head;
        for (iCount = 1; iCount < iPosition; iCount++) {
            prevNode = currNode;
            currNode = currNode.getNext();
        }
    }

    // printlist() method prints out the content of the list                                  
    @Override
    public void printList() {
        GlNode tempNode = head;
        while (tempNode != null) {
            System.out.println(tempNode.toString());
            tempNode = tempNode.getNext();
        }
    }
}
