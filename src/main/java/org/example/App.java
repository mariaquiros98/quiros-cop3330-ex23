/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Maria Quiros
 */

/*Declaring package*/
package org.example;

/*Importing scanner class*/
import java.util.*;

/*Specifying class*/
public class App {
    public static void main(String[] args) {

        /*Creating a scanner object*/
        Scanner scan = new Scanner(System.in);

        /*Initializing variables*/
        String answer;
        String y = "";
        String n = "";

        System.out.println("Is the car silent when you turn the key?");
        answer = scan.nextLine();

        if (answer.equals(y)) {
            System.out.println("Are the battery terminals corroded?");
            answer = scan.nextLine();
            if (answer.equals(y))
                System.out.println("Clean terminals and try starting again.");
            else
                System.out.println("Replace cables and try again.");
        }

        if (answer.equals(n)) {
            System.out.println("Does the car make a slicking noise?");
            answer = scan.nextLine();
            if (answer.equals(y))
                System.out.println("Replace the battery.");
            else if
                System.out.println("Does the car crank up but fail to start?");
            else
            System.out.println("Check spark plug connections.");
        }

        System.out.println("Does the engine start and then die?");
        answer = scan.nextLine();

        if (answer.equals(y)) {
            System.out.println("Does you car have fuel injection?");
            answer = scan.nextLine();
            if (answer.equals(y))
                System.out.println("Get it in for service.");
            else
                System.out.println("Check to ensure the choke is opening and closing.");
        }

        if(answer.equals(n)) {
            System.out.println("This should not be possible.");
        }
    }
}


