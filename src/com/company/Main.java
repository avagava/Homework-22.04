package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Homework: Do some research on more string methods and have an
        // example with at least 3 other methods not discussed in class.


        //isEmpty() - checks whether a string is empty or not
        System.out.println("Check if the text line is empty or not");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
         if (string.isEmpty()){
             System.out.println("The entered text is empty");
         } else {
             System.out.println("The entered text is not empty");
         }

         //OR
        String emptyexample = "";
        String notempty = "I like Java.";

        System.out.println(emptyexample.isEmpty());
        System.out.println(notempty.isEmpty());

        //String length() - checks the numer of characters in a string.
        String string1 = new String("Hello, world!");
        String string2 = new String ("I like java programming.");
        String string3 = new String("Do you like java?");

        System.out.println("Length of string 1 is " + string1.length());
        System.out.println("Length of string 2 is " + string2.length());
        System.out.println("Length of string 3 is " + string3.length());

        //split() - splits a string into an array of substrings.
        String string4 = new String("14/11/1997");
        System.out.println("split(String regex): ");

        String array1[] = string4.split("/");
        for (String temp: array1) {
            System.out.println(temp);
        }

    }
}
