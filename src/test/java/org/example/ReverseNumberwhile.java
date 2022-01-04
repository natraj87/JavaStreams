package org.example;

public class ReverseNumberwhile {

    //Reverse  number using while loop

    public static void main(String[] args)
    {

        int number = 9876543;
        int reversenumber = 0;
        while(number > 0)
        {
            reversenumber =reversenumber *10  + number%10;
            number = number / 10;
        }

        System.out.println(reversenumber);
    }
}
