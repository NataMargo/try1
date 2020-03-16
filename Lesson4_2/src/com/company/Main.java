package com.company;
import java.util.Scanner;


public class Main {
    static String convertToBinary(int number) {
        String binary = "";
        String binaryR = "";
        while (number != 0) {
            int result = number % 2;
            binary += Integer.toString(result);
            number = number / 2;
        }
        for (int i = (binary.length() - 1); i >= 0; i--) {
            binaryR += binary.charAt(i);
        }
        return binaryR;
    }
    public static void main (String[]args){
        var Scanner = new Scanner(System.in);
        System.out.println("Enter integer number");
        int number = Scanner.nextInt();
        System.out.println(convertToBinary(number));
        System.out.println(Integer.toBinaryString(number));

    }
}

/*Напишите программу на языке Java, которая вводит целое число,
преобразует его в двоичное представление, сохраняя как строку, и выводит в
консоль результат. Преобразование выполняется отдельным методом.*/

/*package com.company;

import jdk.nashorn.internal.objects.NativeString;

import java.util.Scanner;


public class Main {
    static String convertToBinary(int number) {

        }

        public static void main (String[]args){
            var Scanner = new Scanner(System.in);
            System.out.println("Enter integer number");
            number = Scanner.nextInt();
            System.out.print(convertToBinary(number));
            System.out.print(Integer.toBinaryString(number));
        }
    }
}/*Напишите программу на языке Java, которая вводит целое число,
преобразует его в двоичное представление, сохраняя как строку, и выводит в
консоль результат. Преобразование выполняется отдельным методом.*/