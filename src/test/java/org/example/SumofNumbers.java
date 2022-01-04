package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumofNumbers {

    public static void main(String args[])
    {
        List<Integer> a= new ArrayList<Integer>(Arrays.asList(10,20,30,10,20,45,55,79,89,92,112,120));
       // int sum =  a.stream().reduce(0,(x,y)->x+y);
       int sum = a.stream().reduce(0,Integer::sum);
        System.out.println(sum);
    }

}
