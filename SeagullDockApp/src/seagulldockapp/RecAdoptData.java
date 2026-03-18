/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seagulldockapp;

/**
 *
 * @author Sophie Quinn
 */
//this is the data within the stack,
//code was taken and modified from Hamilton Niculescu's code 
//available on NCI Moodle, Data Structures & Algorithms module, 2026
//comments are my own
    public class RecAdoptData{
        
        public void AdoptL(){//method for the stack to function
        RecAdoptStack AdoptList;
        AdoptList = new RecAdoptStack();

        //pushes new objects into the stack
        AdoptList.push("Barry");
        AdoptList.push("Wick");
        AdoptList.push("John");
        AdoptList.push("Jill");
        AdoptList.push("Abbey");

        // check the size of the stack
        System.out.println("Recent adoptions this week: " + AdoptList.size());
        System.out.println("******************");


    }
}
