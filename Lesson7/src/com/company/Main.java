package com.company;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        Shape[] Figures = new Shape[]{
                new Rectangle("blue", 5.5, 7.8),
                new Rectangle("red", 7.5, 3.8),
                new Rectangle("black", 9.5, 5.8),
                new Rectangle("violet", 3.5, 4.8),
                new Circle("white", 7),
                new Circle("blue", 4.5),
                new Circle("orange", 11),
                new Triangle("white", 7.2, 10, 5),
                new Triangle("green", 8.7, 11, 7)
        };

        for (Shape obj : Figures) {
            System.out.println(obj+ " , area = "+ obj.calcArea());
                    }
        System.out.println("-----------------------------");
        double areaAll = calcAllArea(Figures);
        System.out.println("Area of all figures =" + areaAll);
        System.out.println("----------------------------");
        System.out.println("Area of circles, triangles, rectangles");
        double [] area =calcAreaShape(Figures);
        System.out.println(Arrays.toString(area));
        System.out.println("---------------------------");
        System.out.println("Area of circles= " + area[0]);
        System.out.println("Area of triangles= " + area[1]);
        System.out.println("Area of rectangles= " + area[2]);
    }
    private static double [] calcAreaShape (Shape []  Figures) {
        int n = 0;
        double [] area ={ 0,0,0 };
        double areaCircle=0;
        double areaTriangle = 0;
        double areaRect = 0;
        for (Shape elem : Figures) {

            if (Figures[n] instanceof Rectangle) {
                areaRect += Figures[n].calcArea();
            } else if (Figures[n] instanceof Circle) {
                areaCircle += Figures[n].calcArea();
            } else if (Figures[n] instanceof Triangle) {
                areaTriangle += Figures[n].calcArea();
            }
            n++;
        area[0]=areaCircle;
        area[1]=areaRect;
        area[2]=areaTriangle;
    } return area;
    }

    private static double calcAllArea (Shape []  Figures) {
        int i = 0;
        double result = 0.0;
        for (Shape elem : Figures) {
            result += Figures[i].calcArea();
            i++;
        }
        return result;
    }
}



//− опишите класс Main с методом main(), в котором создайте массив фигур
//(четыре прямоугольника, три окружности, два треугольника) и
//отобразите его в консоль вместе с информацией о площади фигур.
//Предусмотрите для вывода массива фигур некоторый метод класса Main.
//− добавьте в класс Main метод вычисления общей площади всех фигур
//созданного массива.
//− добавьте в класс Main метод вычисления общей площади фигур каждого
//типа в созданном массиве (т.е. метод возвращает массив суммарных
//площадей каждого типа фигур).
//− добавьте в метод main() вызов описанных методов.
//
//Требования:
//1) При кодировании должны быть использованы соглашения об
//оформлении кода для языка Java.
//2) Используйте оператор instanceof для определения типа фигуры.*/

