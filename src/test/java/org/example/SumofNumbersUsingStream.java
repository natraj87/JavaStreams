package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//sum of numbers using stream
public class SumofNumbersUsingStream {

    public static void main(String args[])
    {
        List<Integer> a= new ArrayList<Integer>(Arrays.asList(10,20,30,10,20,45,55,79,89,92,112,120));
        System.out.println(a.stream().mapToInt(i->i.intValue()).sum());
    }
}
