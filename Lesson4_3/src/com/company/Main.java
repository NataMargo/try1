package com.company;

import java.util.Scanner;

public class Main {
    public static String findLastSymbol(int number) {
        String line;
        int QUANTITY_OF_LAST_SYMBOL = 2;
        line=Integer.toString(number);
        int position1=(line.length()-1);
        int position=line.length()-QUANTITY_OF_LAST_SYMBOL;
        String result =line.substring(position1)+line.substring(position,position1);

        return result;

    }

    public static void main(String[] args) {
        var Scanner = new Scanner(System.in);
        System.out.println("Enter integer number");
        int number = Scanner.nextInt();
        String revertLastSymbols =findLastSymbol(number);
        System.out.println(revertLastSymbols);
    }
}

/*Напишите программу на Java, которая:
− вводит переменную целого типа и выводит результат ее обработки;
− обработка – это метод, который получает целое число, определяет две
последние цифры и возвращает их в виде строки символов в обратном
порядке. Например, число 2546, результат – "64".*/
