package com.udemy;

import java.util.Arrays;

public class Thirdcode {
    public static void main(String[] args) {
int k=1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k * 3);k++;
                System.out.print("\t");
            }
        System.out.println(" ");
    }
}}