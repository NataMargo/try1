package com.company;

import java.util.*;

class ListData {

    private List list = new ArrayList();
    private Set set = new HashSet();

    void createSet(int length, int maxValue, int minValue) {

        for (int i = 0; i < length; i++) {
            double n = Math.random() * (maxValue - minValue) + minValue;
            set.add(n);

        }

    }

    void createList(int length, int maxValue, int minValue) {
        do {
            double n = Math.random() * (maxValue - minValue) + minValue;
            list.add(n);
        }
        while (list.size() < length);

    }

    void printList() {
        Iterator it1 = list.iterator();
        while (it1.hasNext()) {
            System.out.print(it1.next() + " ");
        }
    }

    void printSet() {
        Iterator it1 = set.iterator();
        while (it1.hasNext()) {
            System.out.print(it1.next() + " ");
        }
    }
}




