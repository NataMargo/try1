package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] summArray(int n,int[] arr1, int[] arr2) {
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = arr1[i] + arr2[i];
        }
        return result;
    }
    public static void main(String[] args) {
        var Scanner= new Scanner(System.in);
        System.out.println("Enter number of array's elements ");
        int n= Scanner.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        System.out.println("Enter " +n + " numbers for the array1: ");
        for (int i=0;i<arr1.length;i++) {
            arr1[i] = Scanner.nextInt();
        }
        System.out.println("Enter " +n + " numbers for the array2: ");
        for (int i=0;i<arr2.length;i++) {
            arr2[i] = Scanner.nextInt();
        }
        int array3[] = summArray(n,arr1, arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println("_______________________");
        System.out.println(Arrays.toString(array3));

    }
}

/* Напишите программу на языке Java, которая создает два массива
одинаковой размерности, а затем создает третий такой же размерности и
заполняет его попарной суммой элементов из первых двух.*/


