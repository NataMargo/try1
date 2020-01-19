
	package com.company;

import java.util.Scanner;


    public class Main {

        static String findUniqueSymbol(String text) {
            String result = "";
            int iSymbol = 0;
            while (iSymbol < text.length()) {
                String text1 = text.substring(iSymbol, (iSymbol + 1));
                int iLast = text.lastIndexOf(text1);
                int iFirst = text.indexOf(text1);
                if (iFirst == iLast) {
                    result  += text1;
                }
                iSymbol++;
            }
            return result;
        }
        public static void main(String[] args) {
            var Scanner = new Scanner(System.in);
            System.out.println("Enter some text");
            String line = Scanner.nextLine();
            String uniqueText = findUniqueSymbol(line);
            System.out.println(uniqueText);
        }
    }


/*Напишите программу на языке Java, которая вводит некоторую строку и
выводит в консоль все уникальные символы этой строки. Обработка строки
выполняется отдельным методом.*/

