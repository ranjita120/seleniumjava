package com.udemy;

public class ThisDEmo {
    int a=20;
public void getdata()
{
    int a=30;
    int b=this.a+a;
    System.out.println("value of a is: " + a);
    System.out.println("value of a in object "  + this.a);
    System.out.println("sum of two is: " + b);
}
    public static void main(String[] args) {
    ThisDEmo d1=new ThisDEmo();
    d1.getdata();
        System.out.println("program completed");
    }
}
