package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year <= 0 || month < 1 || month > 12) {
            System.out.println("Invalid date");
            return;
        }

        boolean isLeapYear = isLeapYear(year);
        int daysInMonth = getDaysInMonth(month, isLeapYear);

        if (daysInMonth != -1) {
            System.out.println("Number of days in the month: " + daysInMonth);
        } else {
            System.out.println("Invalid date");
        }
    }

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public int getDaysInMonth(int month, boolean isLeapYear) {
        return switch (month) {
            case 2 -> isLeapYear ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
    }

}
