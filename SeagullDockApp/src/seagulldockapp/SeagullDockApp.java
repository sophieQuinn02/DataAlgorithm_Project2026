/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seagulldockapp;

/**
 *
 * @author Sophie Quinn
 */
public class SeagullDockApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //links the GUI ro the main app
        SDGUI mygui = new SDGUI();
        mygui.setVisible(true);
        
        //creates both singly-linked lists for the 2 seagull types
        CommonGullSSL myCGull = new CommonGullSSL();
        HerringGullSSL myHGull = new HerringGullSSL();
        
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
        System.out.println("items in CommonGull: " + myCGull.size());
        System.out.println("Is the CommonGull list empty? " + myCGull.isEmpty());
        //Common Gull SSL ENDS HERE
        
        System.out.println("***************");
        
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
        System.out.println("items in HerringGull: " + myHGull.size());
        System.out.println("Is the CommonGull list empty? " + myHGull.isEmpty());
        //Herring Gull SSL ENDS HERE
    }
}
