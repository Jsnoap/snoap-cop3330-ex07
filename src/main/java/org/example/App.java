/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    // Calculates the area of a room given in feet squared and meters squared given length and width in feet.
    public static void main( String[] args )
    {
        int length, width, areaFeet;
        double areaMeters, conversion;

        conversion = .09290304;

        System.out.println("What is the length of the room in feet?");
        Scanner inputLength = new Scanner(System.in);
        length = inputLength.nextInt();

        System.out.println("What is the width of the room in feet?");
        Scanner inputWidth = new Scanner(System.in);
        width = inputWidth.nextInt();

        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
        System.out.println("The area is");

        areaFeet = length * width;

        System.out.println(areaFeet + " square feet");

        areaMeters = areaFeet * conversion;

        System.out.println(areaMeters + " square meters");
    }
}
