package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Identifyduplicates {

    //Remove duplicates in Array list using Stream and converting to Set

    public static void main(String[] args)
    {
        List<Integer> a= new ArrayList<Integer>(Arrays.asList(10,20,30,10,20,45,55,79,89,92,112,120));
        Set<Integer> b = new HashSet<>();
       // List<Integer> b = a.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        //System.out.println(b);
        b.addAll(a);

    }
}
