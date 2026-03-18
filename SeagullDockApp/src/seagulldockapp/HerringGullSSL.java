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
//comments are my own

//commongullSSL uses the interface
public class HerringGullSSL implements GullListInterface {
    private GullNode head;
    private int iSize;
    private GullNode currNode;
    private GullNode prevNode;
    

    //method for the nodes within the SSL
    public class GullNode {
        private Object element; //creates the object and element
        private GullNode next; //creates the pointer to the next node

        public GullNode(Object inElement, GullNode inNode) {
            element = inElement;//data for the element
            next = inNode;//the node's pointer
        }

        //selects and returns the node after the currently selected one
        public GullNode getNext() {
            return next;
        }

        //sets the node after the currently selected one to be connected to each other
        public void setNext(GullNode inNode) {
            next = inNode;
        }

        //selects and returns an element from a node
        public Object getElement() {
            return element;
        }

        //changes the element in the selected object
        public void setElement(Object inElement) {
            element = inElement;
        }

        //toString allows the objects to be converted to strings
        @Override
        public String toString() {
            return element.toString();
        }
    }
    
        //main attributes of the HerringGullSSL
    public HerringGullSSL(){
        head = null;//data of the head/first node
        iSize = 10;//number of objects in the SSL
        currNode = head;//current position of the node
        prevNode = null;//data of the previous node
    }


    //checks if the SSL size is equal to 0, if it is return true, else false
    @Override
    public boolean isEmpty() {
        if (iSize == 0) {
            return true;
        } else {
            return false;
        }
    }

    //checks the size of the SSL and returns the number of objects
    @Override
    public int size() {
        return iSize;
    }

    //add an element to the list, assume the iPosition is in the correct range
    @Override
    public void add(int iPosition, Object theElement) {
        //special case of adding at the head of the list (on the first position)
        if (iPosition == 1) {
            GullNode newNode = new GullNode(theElement, head);
            head = newNode;
        } else {
            setCurrent(iPosition);
            GullNode newNode = new GullNode(theElement, currNode);
            prevNode.setNext(newNode);
        }
        //as a new one was added the size counter must be incremented by 1
        iSize = iSize + 1;
    }

    //add an element at the end of the list (on the last position)
    @Override
    public void add(Object theElement) {
        GullNode newNode = new GullNode(theElement, null);
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
        GullNode tempNode = head;
        while (tempNode != null) {
            System.out.println(tempNode.toString());
            tempNode = tempNode.getNext();
        }
    }
}
