package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        double weightKg;
        double weightPound;
        int kg;
        var Scanner =new Scanner(System.in);
        System.out.println("Enter weight in pounds");
        weightPound = Scanner.nextDouble();
        weightKg=weightPound*453.59237/1000;
        int KG = (int) weightKg;
        double Gram= (weightKg-KG)*1000;
        int Gr=(int)Gram;

        System.out.println("Weight in kg is: "+ KG+ " kg "+Gr+ " Gram");
    }
}
