package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Evennumbers {

    public static void main(String[] args)
    {
        List<Integer> a= new ArrayList<Integer>(Arrays.asList(10,20,30,10,20,45,55,79,89,92,112,120));
      List<Integer> evenno =  a.stream().filter(x->(x%2)==0).collect(Collectors.toList());
      System.out.println(evenno);

    }
}
