package com.udemy;


public class Constructor {

        public  Constructor()
        {
             System.out.println(" I am in the constructor");

        }

public Constructor(int i,int j)
{
    System.out.println("value of i and j: " + i  +j);
}
public Constructor(String z)
{
    System.out.println("value of z is: " +z) ;
}

    public static void main(String[] args) {

         //Constructor c1=new Constructor();
        Constructor c2=new Constructor(1,2);
        Constructor c3=new Constructor("ishanth");


    }




}
