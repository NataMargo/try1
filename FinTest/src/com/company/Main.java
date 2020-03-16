package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {9, 9, 3, 4, 5, 4, 5};
Integer x= 2000;
        System.out.println(x.hashCode());

        int f=5;
        System.out.println(++f+f++);
       //Arrays.sort(arr1);
        int []result = new int [arr1.length];
        int count=0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j <arr1.length; j++) {
                if (arr1[i] != arr1[j]) {
                    result[count] = arr1[i];
                }

            }


        }System.out.println(Arrays.toString(result));
    }
}

