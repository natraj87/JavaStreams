package org.example;

import java.util.Scanner;

public class Reverseusingrecursion {

    static int reversenumber = 0;

    public static void reversenumber(int number)
    {
             if (number < 10) {
                 reversenumber = reversenumber * 10+number;
             } else {
                 reversenumber = reversenumber * 10 + number % 10;
                 //System.out.println(reversenumber);
                 number = number / 10;
                // System.out.println(number);
                 reversenumber(number);
                 //System.out.println("_______________________________________________________________");
             }

    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number ");
        int number = in.nextInt();
        reversenumber(number);
        System.out.println(reversenumber);
    }
}
