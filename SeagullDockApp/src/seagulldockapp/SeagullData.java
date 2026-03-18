/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seagulldockapp;

/**
 *
 * @author Sophie Quinn
 */
//this is the data within both singly-linked lists,
//code was taken and modified from Hamilton Niculescu's code 
//available on NCI Moodle, Data Structures & Algorithms module, 2026
//comments are my own
public class SeagullData {
     //creates both singly-linked lists for the 2 seagull types
        CommonGullSSL myCGull = new CommonGullSSL();
        HerringGullSSL myHGull = new HerringGullSSL();
        
        //stores both SSLs in a method
        public SeagullData(){ 
        //Common Gull SSL STARTS HERE
        myCGull.add(1, "Bob");
        myCGull.add(2, "Sandy");
        myCGull.add(3, "Tubby");
        myCGull.add(4, "Chuck");
        myCGull.add(5, "Dimitri");
        myCGull.add(6, "Brooke");
        myCGull.add(7, "Pigeon");
        myCGull.add(8, "Shady");
        myCGull.add(9, "March");
        myCGull.add(10, "Noah");
        //checks how many objects are in the list, prints the number of objects
        System.out.println("items in CommonGull: " + myCGull.size());
        //checks to see if the SSL is empty, returns true if it is, false if not
        System.out.println("Is the CommonGull list empty? " + myCGull.isEmpty());
        //Common Gull SSL ENDS HERE
        
        System.out.println("***************"); //barrier between SSLs for legibility
        
        //Herring Gull SSL STARTS HERE
        myHGull.add(1, "Darrel");
        myHGull.add(2, "Quirky");
        myHGull.add(3, "February");
        myHGull.add(4, "Tommy");
        myHGull.add(5, "Fred");
        myHGull.add(6, "Sunset");
        myHGull.add(7, "Pasta");
        myHGull.add(8, "Ashley");
        myHGull.add(9, "Block");
        myHGull.add(10, "Duke");
        //checks how many objects are in the list, prints the number of objects
        System.out.println("items in HerringGull: " + myHGull.size());
        //checks to see if the SSL is empty, returns true if it is, false if not
        System.out.println("Is the CommonGull list empty? " + myHGull.isEmpty());
        //Herring Gull SSL ENDS HERE
    }
    //Getters for both SSLs, sent to the GUI
    public CommonGullSSL getCommonGullSSL() {
        return myCGull;
    }

    public HerringGullSSL getHerringGullSSL() {
        return myHGull;
    }
}