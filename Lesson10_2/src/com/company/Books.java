package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;


public class Books implements Comparator, Serializable {
    Book[] Books = new Book[]{
            new Book(1, "Romeo and Julietta", "Sheakspear", "BBC", 1995, 125),
            new Book(2, "Тореадори з Васюківки", "Нестайко", "Абабагаламага", 2010, 145),
            new Book(3, "Дракони, вперед", "Штанко", "Абабагаламага", 2014, 115),
            new Book(4, "Лісова школа", "Нестайко", "Школа", 2009, 255),
            new Book(5, "Абетка", "Малкович", "Абабагаламага", 2009, 150),
            new Book(6, "Тореадори з Васюківки", "Нестайко", "Школа", 1985, 99),
            new Book(7, "Лісова школа", "Нестайко", "Школа", 2009, 225),
            new Book(8, "Бешкетні вірші", "Фалькович", "Школа", 2012, 95)

    };

    Book[] searchBooksAfterYear(int year) {

        Book[] booksPublished = new Book[Books.length];
        int count = 0;
        for (Book elem : Books) {
            if (elem.getYearPublish() > year) {
                booksPublished[count] = elem;
                count++;
            }
        }
        return Arrays.copyOf(booksPublished, count);
    }

    public Book[] searchBooksAuthor(String name) {
        Book[] booksAuthor = new Book[Books.length];
        int count = 0;
        for (Book elem : Books) {
            if (elem.getAuthor().equalsIgnoreCase(name)) {
                booksAuthor[count] = elem;
                count++;
            }
        }
        return Arrays.copyOf(booksAuthor, count);

    }

    public Book[] getBooks() {
        return Books;
    }

    public void setBooks(Book[] Books) {
        this.Books = Books;
    }

    public void printBook() {
        for (Book elem : Books)
            System.out.println(elem);

    }

    public void changePrice(double k) {
        int PERCENT = 100;
        for (Book elem : Books) {
            double newPrice = elem.getPrice() * (PERCENT + k) / PERCENT;
            elem.setPrice(newPrice);
        }

    }

    @Override

    public int compare(Object o1, Object o2) {
        String author1 = ((Book) o1).getAuthor();
        String author2 = ((Book) o2).getAuthor();
        return author1.compareTo(author2);
    }

    public static class CompareHouse implements Comparator {
        public int compare(Object o1, Object o2) {
            String housePublish1 = ((Book) o1).getHousePublish();
            String housePublish2 = ((Book) o2).getHousePublish();
            return housePublish1.compareTo(housePublish2);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static class CompareAuthor implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            String author1 = ((Book) o1).getAuthor();
            String author2 = ((Book) o2).getAuthor();
            return author1.compareTo(author2);
        }
    }
}
