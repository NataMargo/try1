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
        System.out.println("Average: "+ countAverage(arr));
        int quantity=0;
        for (int element:arr) {
            if (element>countAverage(arr)){
                quantity++;
            }
        }
        System.out.println("Quantity of elements bigger than average: "+ quantity);

            }

    static double countAverage(int[] arr) {
        double result;
        double sum=0;
        for (int element : arr) {
            sum += element;

        }result = sum / arr.length;
        return result;
    }
}


//Напишите программу на языке Java, которая создает массив любого
//типа, а затем вычисляет среднее арифметическое элементов массива и
//количество элементов массива больше этого средне арифметического.