/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seagulldockapp;

/**
 *
 * @author Sophie Quinn
 */
//This is the queue data, the code below was sourced 
//from Hamilton Niculescu's code available on NCI Moodle,
//Data Structures & Algorithms module, 2026
//comments are my own
    public class MessagesData{
        MessagesQueue incomingMessages = new MessagesQueue();
        //the three messages a new user would recieve
        public void SeagullMSG(){   
            incomingMessages.enqueue("Welcome to SeagullDock!");
            incomingMessages.enqueue("Thank you for participating as a beta tester\n for our application!");
            incomingMessages.enqueue("You have adopted a new seagull!");
            System.out.println("******************");//asterisk bars for terminal legibility

            //displays how many messages are in the queue
            System.out.println("You have " + incomingMessages.size() + " new messages!");
            System.out.println("******************");


        }
    }
