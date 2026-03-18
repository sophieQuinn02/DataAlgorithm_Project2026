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
public interface GullListInterface {
    public void add(int iPosition, Object theElement);
    public void add(Object theElement);
    public Object get(int iPosition);
    public void remove(int iPosition);
    public boolean isEmpty();
    public int size();
    public void printList();
}
