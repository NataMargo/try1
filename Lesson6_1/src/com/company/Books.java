package com.company;

import java.util.Arrays;

public class Books {
    private Book[] Books = new Book[]{
            new Book(1, "Romeo and Julietta", "Sheakspear", "BBC", 1995, 125),
            new Book(2, "Тореадори з Васюківки", "Нестайко", "Абабагаламага", 2010, 145),
            new Book(3, "Дракони, вперед", "Штанко", "Абабагаламага", 2014, 115),
            new Book(4, "Лісова школа", "Нестайко", "Школа", 2009, 255),
            new Book(5, "Абетка", "Малкович", "Абабагаламага", 2009, 150),
            new Book(6, "Тореадори з Васюківки", "Нестайко", "Школа", 1985, 99),
            new Book(7, "Лісова школа", "Нестайко", "Школа", 2009, 225),
            new Book(8, "Бешкетні вірші", "Фалькович", "Школа",2012 , 95)

    };

        public Book[] searchBooksAfterYear(int year) {

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

    public Book[] searchBooksAuthor(String author) {

        Book[] booksAuthor = new Book[Books.length];
        int count = 0;
        for (Book elem : Books) {
            if (elem.getAuthor() == author) {
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
        for (Book elem : Books) {
            elem.viewBook();
        }
    }
    public void changePrice(double k){
        int PERCENT=100;
        for (Book elem: Books) {
            double newPrice= elem.getPrice()*(PERCENT+k)/PERCENT;
            elem.setPrice(newPrice);
        }
        {

        }
    }

}


//опишите класс Books, который будет содержать массив объектов (поле)
//типа Book; конструктор, принимающий размер массива и выделяющий
//память под него; метод добавления одной книги; метод отображения всех
//книг в массиве; метод изменения стоимости книг на указанное количество
//процентов; метод поиска всех книг указанного автора; метод поиска всех
//книг, изданных после указанного года.