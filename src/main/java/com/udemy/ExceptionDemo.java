package com.udemy;

public class ExceptionDemo {


    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        int c;
        int[] arr = new int[3];
        try {
             c = a / b;
//            System.out.println(arr[5]);
        } catch (ArithmeticException e2) {
            System.out.println("arithametic excetion caught");
            c=0;
        } catch (IndexOutOfBoundsException e1) {
            System.out.println("trying to access index out of bound");
        } catch (Exception e3) {
            System.out.println("default exception catch");
        } finally {
            System.out.println("close all the brwoser");
        }

    }
}

