package com.company;

public class Main {

    public static void main(String[] args) {

        int width = 7;
        int height = width * 2;
        int column = 0;
        int line = 1;
        while (line < (height-1)) {
            if ((column >= line)||(column >=(height - line))) {
                System.out.println();
                line++;
                column=0;
            }
            System.out.print("* ");
            column++;
        }
    }
}

