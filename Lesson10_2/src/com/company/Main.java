package com.company;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import com.company.SaveRead;

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

       SaveRead saveRead = new SaveRead();
       saveRead.serialization(Books.Books);
        try {Book books = saveRead.deserialization();
            System.out.println(books);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
//добавьте в программу класс, который содержит методы сохранения и
//чтения набора книг из файла.
//− предусмотрите, что при запуске программы на исполнение, данные должны
//считываться из файла, а по завершению – сохранятся в тот же файл.