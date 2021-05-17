package com.udemy;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> h1=new HashSet<String>();
        h1.add("uk");
        h1.add("usa");
        h1.add("uk");
        System.out.println(h1.contains("uk"));
        System.out.println(h1.isEmpty());
        Iterator<String> i=h1.iterator();
        while(i.hasNext())
            {
                System.out.println(i.next());
            }
    }
}
