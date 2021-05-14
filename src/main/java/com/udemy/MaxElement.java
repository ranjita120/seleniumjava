package com.udemy;

public class MaxElement {
    public static void main(String[] args) {
        int a[][]= {{1,3,3} ,{4,7,8}};
        int max=a[0][0];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(a[i][j] > max)//a[i][j]<min;min=a[i][j]
                    max=a[i][j];
            }
        }
        System.out.println(max);
    }
}
