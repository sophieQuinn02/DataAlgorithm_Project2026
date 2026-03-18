/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seagulldockapp;
import java.util.ArrayList;//allows arraylist to be created

/**
 *
 * @author Sophie Quinn
 */
//this is for the stack to funtion,
//code was taken and modified from Hamilton Niculescu's code 
//available on NCI Moodle, Data Structures & Algorithms module, 2026
//comments are my own

//the class recadoptstack uses the recadoptinterface
public class RecAdoptStack implements RecAdoptInterface {

    private final ArrayList<String> RecentAdoptions;

    //creates a new array for the stack
    public RecAdoptStack() {
        RecentAdoptions = new ArrayList<>();
    }

    //checks if empty, then returns result
    @Override
    public boolean isEmpty() {
        return RecentAdoptions.isEmpty();
    }

  
    //checks if the stack is full, will always return false
    //no limit to stack as opposed to queue
    @Override
    public boolean isFull() {
        return false;
    }

    //removes the object at the top of the stack
    @Override
    public Object pop() {
        if (!(RecentAdoptions.isEmpty())) {
            return RecentAdoptions.remove(0);
        } else {
            return null;
        }
    }

    //adds an object to the top of the stack
    @Override
    public void push(Object newItem) {
        RecentAdoptions.add(0, (String) newItem);
    }

    //checks the number of objects in the stack then returns the result
    @Override
    public int size() {
        return RecentAdoptions.size();
    }
}
