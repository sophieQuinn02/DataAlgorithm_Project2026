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
public class MessagesQueue implements MessagesInterface {

    private final ArrayList<String> incomingMessages;

    /* Creates a new instance of MyQueue class */
    public MessagesQueue() {
        incomingMessages = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return incomingMessages.isEmpty();
    }
    @Override
    public int size() {
        return incomingMessages.size();
    }

    @Override
    public Object frontElement() {
        if (!incomingMessages.isEmpty()) {
            return incomingMessages.get(0);
        } else {
            return null;
        }
    }
    @Override
    public void enqueue(Object element) {
        incomingMessages.add((String) element);
    }
    @Override
    public Object dequeue() {
        if (!incomingMessages.isEmpty()) {
            return incomingMessages.remove(0);
        } else {
            return null;
        }
    }
}
