package com.udemy;

public class FirstCode {

    public static void main(String[] args) {
        int k = 1;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println("");
        }
    }
}
