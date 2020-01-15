package com.company;

public class Main {

    public static void main(String[] args) {
        int quantity=2;
        int q=0;
        do {
            int wight = 4;
            int maxLine=wight*2-1;
            int line = 0;
            while (line <= maxLine) {
                int column = maxLine;
                while ((column) >= (line+1)) {
                    System.out.print(" ");
                    column--;
                }
                while ((column) <= (line) && column >= 0) {
                    System.out.print("* ");
                    column--;
                }
                line++;
                System.out.println();
            }
            q++;
        }
        while (q<quantity);
    }
}
