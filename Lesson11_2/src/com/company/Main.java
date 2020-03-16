package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Translator vocabulary = new Translator();

        vocabulary.put("pupil", "учень(учениця)");
        vocabulary.put("he", "він");
        vocabulary.put("is", "є");
        vocabulary.put("she", "вона");
        vocabulary.put("goes", "іде");
        vocabulary.put("to", "до");
        vocabulary.put("school", "школи");
        vocabulary.put("a", "");
        vocabulary.put("and", "i");
        vocabulary.put("good", "гарний(гарна)");
        vocabulary.put("student", "студент(студентка)");
        vocabulary.put("students", "студенти");
        vocabulary.put("they", "вони");
        vocabulary.put("are", "є");

        System.out.println("Enter words to translate");

        String question = reader.readLine();
        String answer = vocabulary.translate(question);

        System.out.print(answer);
    }
}
/*Задание 2: Напишите консольное приложение, которое:
//- описывает класс, являющийся переводчиком с английского языка и
//содержащий словарь английских и русских слов в виде коллекции
//HashMap<String, String>, метод для добавления пары слов, метод для
//перевода полученной фразы;
//- описывает класс, в котором:
//• создается экземпляр описанного класса и наполняется словарь;
//• вводится некоторая фраза на английском языке и отображается ее
//перевод на русском языке.
//Примечание: необходимо учесть ситуацию, когда в словаре не будет
//слова для перевода (как вариант: оно остается без
//перевода)*/