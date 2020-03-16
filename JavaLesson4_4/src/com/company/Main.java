package com.company;

import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        int height = 3;
        int i = 1;
        String line = "";
        String line1 = "";
        int position1 = (height);
        int position = 0;
        int p = 0;
        String result = "";
        String result1 = "";
        while (i <= height + 1) {
            line = Integer.toString(i);
            i++;
            result1 += line;
            System.out.println(result1 + "  ");
        }
    }
}
           /* p= height;
           /* while (p <=height+1) {
line1=Integer.toString(p);
                int n= p-1;

                result += String.valueOf(n);
                p++;

            }
            System.out.println(result);
        }
    }
}
         /*while (p<=result1.length()-1) {
                result = result1.substring(0, p);
                String result3 = result1.substring(0, p);
                System.out.println(result);
                p++;

        }


        }




    // Напишите программу на Java, которая:
− вводит высоту пирамиды и передает ее в метод для вывода пирамиды;
− метод выводит на консоль пирамиду полученной высоты (значение в
диапазоне от 1 по 9). Например, для height = 3:

            1
            121
            12321
            1234321
}
*/