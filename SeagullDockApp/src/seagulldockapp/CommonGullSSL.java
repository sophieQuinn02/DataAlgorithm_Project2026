/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seagulldockapp;

/**
 *
 * @author Sophie Quinn
 */
//this is the entire singly-linked list for the Common Gull,
//code was taken and modified from Hamilton Niculescu's code 
//available on NCI Moodle, Data Structures & Algorithms module, 2026
//comments are my own

//commongullSSL uses the interface
public class CommonGullSSL implements GullListInterface {
    private GullNode head;
    private int iSize;
    private GullNode currNode;
    private GullNode prevNode;
    

    //method for the nodes within the SSL
    public class GullNode {
        private Object element; //creates the object and element
        private GullNode next; //creates the pointer to the next node

        public GullNode(Object inElement, GullNode inNode) {
            element = inElement; //data for the element
            next = inNode; //the node's pointer
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
        
    //main attributes of the CommonGullSSL
    public CommonGullSSL(){
        head = null;//data of the head/first node
        iSize = 10; //number of objects in the SSL
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
    
    //add an element to the list if the first position is selected(head),
    //otherwise create a node where the user selects aside from the head
    @Override
    public void add(int iPosition, Object theElement) {
        if (iPosition == 1) {//if the head is selected
            GullNode newNode = new GullNode(theElement, head);//create a new node at the head
            head = newNode;//created new head node
        } else {    //otherwise
            setCurrent(iPosition);//set position to any other node than head
            GullNode newNode = new GullNode(theElement, currNode);//create a new node
            prevNode.setNext(newNode);//connect the node to the previous one
        }
        //after creating a new node, the SSL will increase by one
        iSize = iSize + 1;
    }

    //creates a node on the last position, indicated by the pointer being null
    @Override
    public void add(Object theElement) {
        GullNode newNode = new GullNode(theElement, null);//creates a new node at the end of the SSL
        if (head == null) {//if the head is null, create a new head
            head = newNode;
        } else {
            setCurrent(iSize);
            currNode.setNext(newNode);//links the node to the previous one
        }
        iSize = iSize + 1;//the SSL increases by one
    }

    //selects the requested position and returns the node
    @Override
    public Object get(int iPosition) {
        setCurrent(iPosition);
        return currNode;
    }

    //removes the current node, if the head is selected, 
    //the next node becomes the new head.
    @Override
    public void remove(int iPosition) {
        if (iPosition == 1) {
            head = head.getNext();
        } else {                //otherwise, change the previous node
            setCurrent(iPosition);//to connect to the node after the removed one
            prevNode.setNext(currNode.getNext());
        }
        //reduces the SSL by one as a node was removed
        iSize = iSize - 1;
    }

    //sets the current node to the head, and the previous node to the position before
    private void setCurrent(int iPosition) {
        int iCount;
        prevNode = null;
        currNode = head;
        for (iCount = 1; iCount < iPosition; iCount++) {
            prevNode = currNode;
            currNode = currNode.getNext();
        }
    }

    //this prints the SSL's contents out                                 
    @Override
    public void printList() {
        GullNode tempNode = head;
        while (tempNode != null) {
            System.out.println(tempNode.toString());
            tempNode = tempNode.getNext();
        }
    }
}
