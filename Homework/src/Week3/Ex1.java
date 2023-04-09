package Week3;

import java.util.GregorianCalendar;

public class Ex1 {
    public static void main(String[] args) {
        /*
        Java API has the GregorianCalendar class in the java.util package,
    which you can use to obtain the year, month, and day of a date.
    - get(GregorianCalendar.YEAR)
    - get(GregorianCalendar.MONTH)
    - get(GregorianCalendar.DAY_OF_MONTH)
        --> return the year, month, and day.
    Write a program to perform two tasks:
        • Display the current year, month, and day.
        • The GregorianCalendar class has the method setTimeInMillis(long), which can
    be used to set a specified elapse time since January 1, 1970. Set the value to
    1234567898765L and display the year, month, and day.
         */
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("The current year: " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("The current month: " + calendar.get(GregorianCalendar.MONTH));
        System.out.println("The current day: " + calendar.get(GregorianCalendar.DAY_OF_MONTH));

        calendar.setTimeInMillis(1234567898765L);
        System.out.println("The display time: " +
                calendar.get(GregorianCalendar.YEAR) + ", " +
                calendar.get(GregorianCalendar.MONTH) + " " +
                calendar.get(GregorianCalendar.DAY_OF_MONTH));
    }


}
