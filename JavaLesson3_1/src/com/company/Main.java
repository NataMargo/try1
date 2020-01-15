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

              /*int catheter = 8;
        int maxLine = catheter*2;
        int line = 0;
        while (line <= maxLine) {
            int column = catheter;
            while (column >= line && column <= catheter) {
                System.out.print("  ");
                column--;
            }
            while (column < line && column >= 0 && line<=catheter) {
                System.out.print("* ");
                column--;
            }
            while (column <=line && line>catheter && column>0) {
                System.out.print("  ");
                column++;
            }
            while (column >= (maxLine-line) && line>=catheter && column<=maxLine) {
                System.out.print("* ");
                column++;
            }
            line++;
            System.out.println();
        }*/