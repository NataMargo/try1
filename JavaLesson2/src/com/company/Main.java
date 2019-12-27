package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        int numberRev;
        var Scanner = new Scanner(System.in);
        System.out.println("Enter 3 digit number:");
        number = Scanner.nextInt();
        if (number < 1000 && number >99){
            numberRev = number / 100 + number % 10 * 100 + (number / 10) % 10 * 10;
            System.out.println("number=    " + number + "\nnumberRev= " + numberRev + "\nentered number-reversed number=" + (number - numberRev));
        } else System.out.println("ERROR! Enter 3 digit number");
    }
}
