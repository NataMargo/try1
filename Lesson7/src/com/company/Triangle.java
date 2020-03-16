package com.company;

public class Triangle extends Shape{
    private double half_perim;
    private double a;
    private double b;
    private double c;

    public Triangle(String color,double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Triangle(String color) {
        super(color);
    }

    @Override
    public String toString() {
        return super.toString() +
        ", a=" + a + ", b=" + b + ", c= " + c;

    }

    @Override
    public double calcArea() {
        half_perim = (a+b+c)/2;
        double area = Math.sqrt(half_perim * (half_perim - a ) * (half_perim -b) * (half_perim -c));
        return area;
    }
}
//опишите класс Triangle как подкласс Shape. Класс Triangle содержит:
////поля a, b, c; конструктор, переопределенные методы toString() и
////calcArea().