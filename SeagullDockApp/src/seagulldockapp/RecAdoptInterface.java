/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package seagulldockapp;

/*
 * @author Sophie Quinn
 */
//This is the stack interface, the code below was sourced 
//from Hamilton Niculescu's code available on NCI Moodle,
//Data Structures & Algorithms module, 2026
//comments are my own
public interface RecAdoptInterface {
    public boolean isEmpty();//checks to see if the stack is empty, returns true if it is, false if not
    public boolean isFull();//checks to see if the stack is full, returns true if it is, false if not
    public void push(Object newItem); //adds a new object to the stack
    public Object pop();//removes an object from the stack
    public int size();//returns the number of objects in the stack
}
