package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.*;


public class Main {

    public static void main(String[] args) {
        var Scanner = new Scanner(System.in);
        System.out.println("Enter number of array's elements ");
        int n = Scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100) - 50;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------------");
        int[][] plusArray = divideArray(n, arr);
        System.out.println(Arrays.toString(plusArray));

    }

    static int[] [] divideArray(int n, int[] arr) {
        int[] plusArray = new int[n];
        int[] minusArray = new int[n];
        int count1 = 0;
        int count2 = 0;
        for (int element : arr) {
            if (element > 0) {
                plusArray[count1] = element;
                count1++;
            }
            if (element < 0) {
                minusArray[count2] = element;
                count2++;
            }
        }

        int[][] result = new int[count1][count2];
        for (int i = 0; i < count1; i++) {
            result[0][i] = copyOf(plusArray, count1)[i];}
        for (int i = 0; i < count2; i++) {
            result[i][0] = copyOf(minusArray, count2)[i];}
        return result;
    }
}






//Напишите программу на языке Java, которая создает массив любого типа, а
//затем разделяет его на два: из положительных и отрицательных элементов.
