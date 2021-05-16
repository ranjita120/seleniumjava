package com.udemy;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calender {
    public static void main(String[] args) {
        System.out.println("args = " + java.util.Arrays.deepToString(args));
        Calendar c1=Calendar.getInstance();
        SimpleDateFormat s1=new SimpleDateFormat("M/dd/yyyy");
        System.out.println(s1.format(c1.getTime()));
        System.out.println(c1.getFirstDayOfWeek());

    }
}
