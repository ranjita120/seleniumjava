package com.udemy;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add("ishu");
        a1.add("ashu");
        a1.add("ran");
        System.out.println(a1);
        System.out.println(a1.get(2));
        a1.remove("ishu");
        System.out.println(a1.isEmpty());
        System.out.println(a1.indexOf("ran"));

    }


}
