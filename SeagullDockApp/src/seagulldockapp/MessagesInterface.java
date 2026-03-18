/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package seagulldockapp;

/*
 * @author Sophie Quinn
 */
//This is the queue interface, the code below was sourced 
//from Hamilton Niculescu's code available on NCI Moodle,
//Data Structures & Algorithms module, 2026
//comments are my own

public interface MessagesInterface {
    public boolean isEmpty(); //checks to see if the queue is empty, returns true if it is, false if not
    public int size(); //shows the number of items in the queue
    public Object frontElement(); //selects the element at the front of the queue
    public void enqueue(Object element); //adds an object to the queue
    public Object dequeue(); //removes an object from the queue
}
