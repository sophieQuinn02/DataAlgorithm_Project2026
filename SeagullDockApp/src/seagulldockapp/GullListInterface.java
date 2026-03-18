/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package seagulldockapp;

/**
 *
 * @author Sophie Quinn
 */

//This is the singly-linked list interface, the code below was sourced 
//from Hamilton Niculescu's code available on NCI Moodle,
//Data Structures & Algorithms module, 2026
//comments are my own
public interface GullListInterface {
    public void add(int iPosition, Object theElement); //adds a new object at a specified position
    public void add(Object theElement); //adds a new object
    public Object get(int iPosition); //selects an object at a specified position
    public void remove(int iPosition); //removes an object from a specified position
    public boolean isEmpty(); //checks to see if the singly-linked list is empty, true if it is, false if not
    public int size(); //returns the number of objects in the singly-linked list
    public void printList();//prints the singly-linked list to the terminal
}
