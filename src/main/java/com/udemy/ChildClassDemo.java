package com.udemy;

public class ChildClassDemo extends ParentClassDemo {
    public void newEngine()
    {
        System.out.println("install new engine features");
    }
    public void colour()
    {
        System.out.println(colour);
    }
    public void breaksystem()

    {
        System.out.println("child:install break system");
    }

    public static void main(String[] args) {
        ParentClassDemo c1=new ParentClassDemo();
        c1.gear();
        c1.audioSystem();
        c1.breaksystem();
    }}
