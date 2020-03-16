package com.company;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static void main(String[] args) {
        double [] array1= {1,5,59,15,58,159};
        double [] array2= {115.2,55.5,99.1,15,58,159};
        int i= array1.length+array2.length;
        double [] newArray;
        newArray= Arrays.copyOf(array1,array1.length+array2.length);
        System.out.println("First array: "+ Arrays.toString(array1));
        System.out.println("Second array: "+ Arrays.toString(array2));
        System.out.println("Auxiliary array:"+ Arrays.toString(newArray));
        System.arraycopy(array2,0,newArray,array1.length,array2.length);
        System.out.println("NewArray-result: "+ Arrays.toString(newArray));
    }
}
//Напишите программу на языке Java, которая создает два массива
//различной размерности, а затем создает третий массив как конкатенацию двух
//исходных.