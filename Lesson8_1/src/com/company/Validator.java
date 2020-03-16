package com.company;

import java.util.Calendar;
import java.util.InputMismatchException;

public class Validator extends Exception {
    public Validator() {
        // initCause(e);
        //    getCause();
        // throw new InputMismatchException();
    }

    private int year;

    public static class YearException extends Exception {
        @Override
        public String getMessage() {
            return "Не допустимое значение!";
        }
    }

    public static void testYear(int year)
            throws YearException {
        int todayYear = Calendar.getInstance().get(Calendar.YEAR);
        if (year > todayYear | year < 0) {
            throw new YearException();
        }
    }

}



//− предусмотрите обработку некорректного ввода данных пользователем через
////механизм обработки исключений (для этого опишите свои исключительные
////ситуации). Например, описываете класс Validator, в котором находятся
////методы проверки чего-то на что-либо, и используете его методы для
////проверки введенных значений. Если все хорошо – программа продолжает
////работу, если данные не верны – бросаете исключение, а код, использующий
////валидацию, должен обработать исключение.
