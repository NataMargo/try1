package com.company;

public class Main {

    public static void main(String[] args) {
        int maxLine = 7;
        int line = 0;
        while (line <= maxLine) {
            int column = 0;
            while (column < maxLine) {
                if (column < (line)) {
                    System.out.print("  ");
                } else {
                    System.out.print(" *");
                }
                column++;
            }
            line++;
            System.out.println();
        }
    }
}

