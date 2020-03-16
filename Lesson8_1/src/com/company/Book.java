package com.company;

import java.util.Comparator;

public class Book  implements Comparable {
        private int ID;
        private String title;
        private String author;
        private String housePublish;
        private int yearPublish;
        private double price;

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getHousePublish() {
            return housePublish;
        }

        public void setHousePublish(String housePublish) {
            this.housePublish = housePublish;
        }

        public int getYearPublish() {
            return yearPublish;
        }

        public void setYearPublish(int yearPublish) {
            this.yearPublish = yearPublish;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public Book(int ID, String title, String author, String housePublish, int yearPublish, double price) {
            this.ID = ID;
            this.title = title;
            this.author = author;
            this.housePublish = housePublish;
            this.yearPublish = yearPublish;
            this.price = price;
        }

    @Override
    public int compareTo(Object o) {
        return (int) (((Book)o).price-this.price);
    }

    @Override
        public String toString() {
            return  "ID=" + ID + ", title='" + title + ", author='" + author + ", housePublish='" + housePublish +
                    ", yearPublish=" + yearPublish +", price=" + price  ;
        }

    }


