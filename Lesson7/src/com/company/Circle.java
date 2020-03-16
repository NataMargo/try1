package com.company;

class Circle extends Shape{

    private double radius;
    private final double PI = 3.14159265359;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return super.toString() + ", radius= " +radius;

    }

    @Override
    public double calcArea() {
        double area =radius * radius * PI;
        return area;
    }
}


//− опишите класс Circle как подкласс Shape. Класс Circle содержит: поле
////radius, конструктор, переопределенные методы toString() и calcArea().
/*public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Device other = (Device)obj;
        if (Double.compare(this.price, other.price) != 0) {
            return false;
        }
        if ( !this.serialNumber.equals(other.serialNumber)) {
            return false;
        }
        return this.manufacturer.equals(other.manufacturer);
    }

    }*/