package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicates {

    public static void main(String[] args)
    {
        ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(10,20,10,30,40,20,50));
        for(int i = 0 ; i < b.size(); i++)
        {
            for(int j = i +1; j < b.size(); j++)
            {
                if(b.get(i) ==b.get(j))
                {
                  System.out.println("Duplicates are " + b.get(i));
                }
            }
        }

    }
}
