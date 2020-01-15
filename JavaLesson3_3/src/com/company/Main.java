package com.company;

public class Main {

    public static void main(String[] args) {

        int maxLine = 7;
        int line = 1;
        while (line <= maxLine) {
            int column = maxLine;
            while (column >= line) {
                System.out.print("  ");
                column--;
            }
            while (column < line && column >= 0) {
                System.out.print("* ");
                column--;
            }
            line++;
            System.out.println();
        }
    }
}
