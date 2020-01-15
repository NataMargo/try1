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

            /*int maxLine=7;
        int line = 1;
        while (line <= maxLine) {
            int column = maxLine;

            while (column >= line) {
                System.out.print("*");
                column--;

            }
            while (column < line && column >=0) {
                System.out.print("0");
                column--;

            }
            line++;
            System.out.println();
        }
    }
}
*/