package com.company;

public class Main {

    public static void main(String[] args) {
        int quantity = 1;
        int q = 0;
        int height = 3;
        int i = 1;
        String line = "";

        int position1 = (height);
        int position = 0;
        int p = 0;
        String result = "";
        String result1 = "";
        while (i <= height + 1) {
            line = Integer.toString(i);
            i++;
            result1 += line;
            System.out.print(result1 + "  ");
            do {
                int wight = 2;
                int maxLine = wight * 2 - 1;
                int line1 = 0;
                while (line1 <= maxLine) {
                    int column = maxLine;
                    while ((column) >= (line1 + 1)) {
                        System.out.print("");
                        column--;
                    }
                    while ((column) <= (line1) && column >= 0) {
                        System.out.print(column + 1);
                        column--;
                    }
                    line1++;
                    System.out.println();
                }
                q++;
            }
            while (q < quantity);
        }
    }
}
