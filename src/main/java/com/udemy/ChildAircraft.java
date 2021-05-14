package com.udemy;

public class ChildAircraft extends ParentAircraft{
    public static void main(String[] args) {
        ChildAircraft c1=new ChildAircraft();
        c1.carColour();
        c1.engine();
        c1.safetyGuidlines();
    }
public void carColour()
{
    System.out.println("decide your own colour");
}
}
