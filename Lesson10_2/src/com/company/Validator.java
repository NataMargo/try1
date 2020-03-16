package com.company;

import java.util.Calendar;

public class Validator extends Exception {
    public Validator() {

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