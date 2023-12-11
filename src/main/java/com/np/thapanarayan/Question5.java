package com.np.thapanarayan;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Question5 {
    public static void main(String[] args) {
        Calendar gregorianCalendar = GregorianCalendar.getInstance();
        System.out.println("Year : " + gregorianCalendar.get(GregorianCalendar.YEAR));
        System.out.println("Month : " + gregorianCalendar.get(GregorianCalendar.MONTH));
        System.out.println("Day : " + gregorianCalendar.get(GregorianCalendar.DAY_OF_YEAR));

    }
}
