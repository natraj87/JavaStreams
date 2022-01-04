package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Smallestofnumbers {

    public static void main(String args[])
    {
        List<Integer> a= new ArrayList<Integer>(Arrays.asList(10,20,30,10,20,45,55,79,89,92,112,120));
        int small = a.stream().sorted(Comparator.naturalOrder()).findFirst().get();
        System.out.println(small);
    }
}
