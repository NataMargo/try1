package com.company;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.substring;

public class Main {
    static String convertToBinary(int number) {
        String result = Integer.toBinaryString(number);
        return result;
        }

    public static void main(String[] args) {
        var Scanner = new Scanner(System.in);
        System.out.println("Enter integer number");
        int number = Scanner.nextInt();
        String result = convertToBinary(number);
        System.out.print(result);
    }
}


/*Напишите программу на языке Java, которая вводит целое число,
преобразует его в двоичное представление, сохраняя как строку, и выводит в
консоль результат. Преобразование выполняется отдельным методом.*/