package com.udemy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        HashMap h1=new HashMap();
        h1.put(1,"ran");
        h1.put(2,"van");
        h1.put(3,"san");
        System.out.println(h1.get(2));
        System.out.println(h1.get(3));
        System.out.println(h1.get(1));
        Set s1=h1.entrySet();
        Iterator i=s1.iterator();
        while (i.hasNext())
        {
            Map.Entry m1=(Map.Entry) i.next();
            System.out.print(m1.getKey());
            System.out.print(m1.getValue());

        }
    }
}
