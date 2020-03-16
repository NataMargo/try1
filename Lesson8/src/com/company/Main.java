package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
/*Задание:
Откройте программу, созданную по Домашнему заданию No6, и внесите
следующие изменения:
− замените в описание класса Book метод view() на метод toString() и
измените код, который использовал метод view(), на соотвествущее
применение метода toString().
− предусмотрите обработку некорректного ввода данных пользователем через
механизм обработки исключений (для этого опишите свои исключительные
ситуации). Например, описываете класс Validator, в котором находятся
методы проверки чего-то на что-либо, и используете его методы для
проверки введенных значений. Если все хорошо – программа продолжает
работу, если данные не верны – бросаете исключение, а код, использующий
валидацию, должен обработать исключение.
− Дополните класс Books методами упорядочивания набора книг по автору в
алфавитном порядке, по издательству в алфавитном порядке, по стоимости
в порядке убывания. Учтите при упорядочивании, что исходный набор не
должен меняться, это только меняется его представление для пользователя,
т.е. нужно применять копирование массива книг перед уподядочиванием.

Требования:
1) При кодировании должны быть использованы соглашения об
оформлении кода для языка Java.
2) Для описание правила сопоставления книг по указанному критерию
используйте интерфейс Comparator.*/