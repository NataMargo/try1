package com.company.lesson4_2;

import java.util.Scanner;

public class main {
    static String convertToBinary(int number) {
        String binary = "";
        while (number != 0) {
            int result = number % 2;
            binary += Integer.toString(result);
            number = number - 2;
            return binary;
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

