package com.udemy;
import com.udemy.CentralTraffic;
import com.udemy.ContinentalTraffic;
public class AustralianTraffic implements CentralTraffic,ContinentalTraffic{
    public static void main(String[] args)
    {
        CentralTraffic a=new AustralianTraffic();
        ContinentalTraffic b=new AustralianTraffic();
        a.redStop();
        a.goGreen();
        a.flashYellow();
        b.move();
        b.stop();
    }
    public void goGreen()
    {
        System.out.println("green light on");
    }
    public void redStop()
    {
        System.out.println("red light on");
    }
    public void flashYellow()
    {
        System.out.println("flash light on");
    }

    public void move() {
        System.out.println("move");
    }

    public void stop() {
        System.out.println("stop");
    }
}
