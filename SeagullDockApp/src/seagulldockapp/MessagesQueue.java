/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seagulldockapp;
import java.util.*; //allows arraylist to be created
/**
 *
 * @author Sophie Quinn
 */
//this is for the queue to funtion,
//code was taken and modified from Hamilton Niculescu's code 
//available on NCI Moodle, Data Structures & Algorithms module, 2026
//comments are my own

//the class messagesqueue uses the messagesinterface
public class MessagesQueue implements MessagesInterface {

    private final ArrayList<String> incomingMessages;

    //creates new array list called incomingMessages
    public MessagesQueue() {
        incomingMessages = new ArrayList<>();
    }

     //checks to see if the queue is empty, returns the result
    @Override
    public boolean isEmpty() {
        return incomingMessages.isEmpty();
    }
    
    //checks how many objects are in the queue, returns the number
    @Override
    public int size() {
        return incomingMessages.size();
    }

    //checks which object is at the front, as long
    //as the queue is populated, returns the front object
    //otherwise, returns nothing
    @Override
    public Object frontElement() {
        if (!incomingMessages.isEmpty()) {
            return incomingMessages.get(0);
        } else {
            return null;
        }
    }
    
    //adds an object to the queue as a string
    @Override
    public void enqueue(Object element) {
        incomingMessages.add((String) element);
    }
    
    //checks to see if the queue is populated, 
    //if it is, removes the first element
    //otherwise do nothing
    @Override
    public Object dequeue() {
        if (!incomingMessages.isEmpty()) {
            return incomingMessages.remove(0);
        } else {
            return null;
        }
    }
}
