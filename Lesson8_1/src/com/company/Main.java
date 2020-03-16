package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Books Books = new Books();
        var Scanner = new Scanner(System.in);
        Books.printBook();
        System.out.println("--------------------------");
        Books author = new Books();
        System.out.println("Enter author's name: ");
        String name= Scanner.nextLine();
        author.setBooks(Books.searchBooksAuthor(name));
        author.printBook();
        if (Books.searchBooksAuthor(name).length==0) {
            System.out.println("There is no books of this author");}
        System.out.println("--------------------------");
        Books other = new Books();
        System.out.println("Enter year of publishing: ");
        int year = Scanner.nextInt();
        other.setBooks(Books.searchBooksAfterYear(year));
        other.printBook();

        try {
            Validator.testYear(year);
        }
        catch (Validator.YearException e)
        {
            System.err.println(e.getMessage());
        }

        if (Books.searchBooksAfterYear(year).length==0) {
            System.out.println("There is no books published after " +year+ " year");}
        System.out.println("--------------------------");
        Books price = new Books();
        System.out.println("Enter percent: ");
        int k = Scanner.nextInt();
        price.changePrice(k);
        price.printBook();
        System.out.println("Sort by price desc-------------------------------");
        Arrays.sort(Books.Books);
        Books.printBook();
        System.out.println("Sort by Author ------------------------------");
        Arrays.sort(Books.Books, new Books.CompareAuthor());
        Books.printBook();
        System.out.println("Sort by House Publishing -------------------------");
        Arrays.sort(Books.Books, new Books.CompareHouse());
        Books.printBook();


    }

}


//− замените в описание класса Book метод view() на метод toString() и
//измените код, который использовал метод view(), на соотвествущее
//применение метода toString().
//− Дополните класс Books методами упорядочивания набора книг по автору в
//алфавитном порядке, по издательству в алфавитном порядке, по стоимости
//в порядке убывания. Учтите при упорядочивании, что исходный набор не
//должен меняться, это только меняется его представление для пользователя,
//т.е. нужно применять копирование массива книг перед уподядочиванием.


