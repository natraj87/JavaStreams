package org.example;

public class Stringreverse {

    public static void main(String[] args)
    {
        String str = "Natrajan";
        String newstr = "";
        char[] ch =str.toCharArray();
        
        for(int i = ch.length-1 ; i >= 0 ; i--)
        {
            System.out.println(ch[i]);
            newstr = newstr + ch[i];
        }

        System.out.println(newstr);
    }
}
