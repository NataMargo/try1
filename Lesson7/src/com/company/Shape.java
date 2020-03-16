package com.company;

public class Shape {


        private String color;

        public Shape(String color) {
                this.color = color;
        }
        public String getColor() {
                return color;
        }
        public void setColor(String Color) {
                this.color=color;
        }


        public double calcArea(){
                return 0.0;
        }
        @Override
        public boolean equals(Object obj) {
                if (this == obj) {
                        return true;
                }
                if (obj == null || this.getClass() != obj.getClass()) {
                        return false;
                }
                Shape other = (Shape) obj;
                return false;
        }

        @Override
        public String toString() {
                return this.getClass().getSimpleName() +
                        ": color= " + color;
        }
}

       // Напишите программу на языке Java, в которой:
//− опишите класс Shape (поле color, конструктор, переопределенный метод
//toString() (строка вида "class=...: color=..."), метод вычисления площади
//фигуры calcArea(), который возвращает значение 0.0) .// public String toString(){
//     //           return "class =...: color=...:";

