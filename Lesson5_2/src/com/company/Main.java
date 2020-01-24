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
        int[] plusArray = plusArray(n, arr);
        System.out.println(Arrays.toString(plusArray));
        int[] minusArray = minusArray(n, arr);
        System.out.println(Arrays.toString(minusArray));

    }

    static int[] plusArray(int n, int[] arr) {
        int[] plusArray = new int[n];
        int count1 = 0;
        for (int element : arr) {
            if (element > 0) {
                plusArray[count1] = element;
                count1++;
            }
        }
        return copyOf(plusArray, count1);
    }

    static int[] minusArray(int n, int[] arr) {
        int[] minusArray = new int[n];
        int count2 = 0;
        for (int element : arr) {
            if (element < 0) {
                minusArray[count2] = element;
                count2++;
            }
        }
        return copyOf(minusArray, count2);
    }
}