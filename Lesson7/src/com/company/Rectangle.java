package com.company;

public class Rectangle extends Shape {

    private double width;
    private double  height;

    public Rectangle(String color , double width, double height)
    {
        super(color);
        this.width =width;
        this.height=height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + ", height= " + height+ ", width= " + width;

    }

    @Override
    public double calcArea() {
        var area = width * height;
        return area;
    }
}
//опишите класс Rectangle как подкласс Shape. Класс Rectangle содержит:
////поля width и height, конструктор, переопределенные методы toString() и
////calcArea().
/*public boolean equals(Object obj) {
        if ( !super.equals(obj)) {
            return false;
        }
        Monitor other = (Monitor)obj;
        return this.x == other.x &&
                this.y == other.y;*/
