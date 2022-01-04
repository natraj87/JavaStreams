package org.example;


//Reverse number using String Buffer and Builder
public class ReverseNumber {

    public static void main(String[] args)
    {
        int num = 12345;
        String s = Integer.toString(num);
        StringBuilder b =new StringBuilder(s);
         int v = Integer.parseInt(String.valueOf(b.reverse()));
         System.out.println(v);
    }
}
