package org.example;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//reverse string using streams
public class Stringreversalusingstreams {

    public static void main(String[] args) {
        String str = "Natrajan is great";
       // String newstr = Stream.of(str).map(word->new StringBuilder(word).reverse()).collect(Collectors.joining());
       StringBuilder d=  new StringBuilder(str).reverse();
        System.out.println(d);

    }
}
