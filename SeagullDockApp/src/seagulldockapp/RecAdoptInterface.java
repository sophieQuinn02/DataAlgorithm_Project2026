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

public interface RecAdoptInterface {
    public boolean isEmpty();
    public boolean isFull();
    public void push(Object newItem);
    public Object pop();
    public int size();
}
