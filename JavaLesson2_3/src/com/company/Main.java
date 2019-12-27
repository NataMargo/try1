package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double sumDepo;
        double termDepo;
        double perCent;
        double profit;
        var Scanner =new Scanner(System.in);
        System.out.println("Enter sum of your deposit in USD");
        sumDepo = Scanner.nextDouble();
        System.out.println("Enter term of your deposit in months");
        termDepo = Scanner.nextDouble();
        System.out.println("Enter per cent of your deposit");
        perCent = Scanner.nextDouble();
        profit=((sumDepo*perCent/100)*termDepo*30.416667/365);
        int p=(int)profit;

        System.out.println("Your profit is: "+ p+"USD");
    }
}
