package com.udemy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat
{
    public static void main(String[] args) {
        Date d1=new Date();
        SimpleDateFormat d2 = new SimpleDateFormat("M/dd/yyyy");
                System.out.println(d2.format(d1));
        SimpleDateFormat d3 = new SimpleDateFormat("M/dd/yyyy hh mm ss");
        System.out.println(d3.format(d1));
    }
}
