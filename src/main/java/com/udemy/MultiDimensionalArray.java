package com.udemy;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int a[]=new int[2];
        a[0]=1;
        a[1]=2;
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
  int b[][]=new int[2][3];
        b[0][0]=5;
        b[0][1]=5;
        b[0][2]=4;
                b[1][0]=4;
                        b[1][1]=4;
                                b[1][2]=4;
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(b[i][j] + "  ");
                //System.out.println(" ");
            }
            System.out.println("\n");
        }


    }
}
