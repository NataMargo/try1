package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter number of List");
        var scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        System.out.println("Enter maximum of List");
        int maxValue = scanner.nextInt();
        System.out.println("Enter minimum value of List");
        int minValue = scanner.nextInt();

        ListData listMy = new ListData();
        listMy.createList(length, maxValue, minValue);
        System.out.println("List is:");
        listMy.printList();
        System.out.println();

        ListData setMy = new ListData();
        setMy.createSet(length, maxValue, minValue);
        System.out.println("Set is:");
        setMy.printSet();

    }
}

////Напишите консольное приложение, которое:
////- описывает класс, генерирующий список (List) и множество (Set) по
////переданным данным - количество и диапазон;
////- описывает класс, в котором создается по одному экземпляру списка и
////множества, а затем они отображаются их в консоль.
////Примечание: необходимо учесть ситуацию, когда диапазон значений
////меньше, чем количество необходимых для генерации
////элементов коллекции.
