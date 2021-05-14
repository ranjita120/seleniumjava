package com.udemy;

public class MethodOverloading {
    void getdata(int a,int b)
    {
        System.out.println("a and b are : " +a  +"  " +b);
    }
    void getdata(String s)
    {
        System.out.println("string s value is: " +s);
    }
     void getdata(int x,String s1)
    {
        System.out.println("value of x and s1 is : " +x  +" " +s1);
    }
    public static void main(String[] args) {
        MethodOverloading m1=new MethodOverloading();
        m1.getdata(2,3);
        m1.getdata(3,
                "ishanth");
        m1.getdata("godsaveme");

    }
}
