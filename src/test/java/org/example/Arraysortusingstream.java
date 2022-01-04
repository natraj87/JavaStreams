package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//sorting arrays using Stream

public class Arraysortusingstream {

    public static void main(String args[])
    {
        List<Integer> a= new ArrayList<Integer>();
        a.add(90);
        a.add(120);
        a.add(130);
        a.add(40);
        System.out.println("Original set is " + a);
        List<Integer> b = a.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(b);

        List<Integer> c= new ArrayList<Integer>();
        c.add(11);
        c.add(12);
        c.add(13);
        c.add(15);
        c.add(16);
        c.add(17);
        System.out.println("Original set is " + c);
        List<Integer> d = c.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(d);
    }
}
