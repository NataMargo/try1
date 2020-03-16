package com.company;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        int number =159879;
        String line;
        int QUANTITY_OF_LAST_SYMBOL = 2;
        line=Integer.toString(number);
        int position1=(line.length()-1);
        int position=line.length()-QUANTITY_OF_LAST_SYMBOL;
        String result =line.substring(position1)+line.substring(position,position1);

        System.out.println(result);
    }
}

