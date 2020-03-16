package com.company;

import java.util.Arrays;

public class Main {
    public static int[] function(int [] arr){
        int[] result = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                result[count] = arr[i];
            }
            count++;
        }

        return Arrays.copyOf(result, count);
    }

    public static void main(String[] args) {

        int[] arr = {0, 2, 5, 6, 7, 10, 0};

        System.out.println(function(arr).toString());


//        for (int elem:result
//             ) {
//            System.out.println(elem);
//        }
//        System.out.println(result.toString());
    }
}

