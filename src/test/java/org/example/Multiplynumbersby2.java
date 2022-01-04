package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Multiplynumbersby2 {

    public static void main(String[] args)
    {
        List<Integer> a= new ArrayList<Integer>(Arrays.asList(10,20,30,10,20,45,55,79,89,92,112,120));
       List<Integer> newlist =  a.stream().filter(x->(x%2)!=0).map(x->x*2).collect(Collectors.toList());
       System.out.println(newlist);

    }
}
