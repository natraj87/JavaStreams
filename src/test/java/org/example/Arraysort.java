package org.example;


import javax.xml.soap.SOAPPart;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//sorting arrays using Inbuilt Method

public class Arraysort {

    public static void main(String args[])
    {
        List<Integer> a= new ArrayList<Integer>();
        a.add(90);
        a.add(120);
        a.add(130);
        a.add(40);
        System.out.println("Original set is " + a);
        a.sort(Comparator.reverseOrder());
        System.out.println("Sorting in reverse order " + a);
        a.sort(null);
        System.out.println("Sorting in ascending order" + a);
    }
}
