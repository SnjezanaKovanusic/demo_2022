package objekti.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Gregorian {


    /*(Use the GregorianCalendar class) Java API has the GregorianCalendar
    class in the java.util package, which you can use to obtain the year, month, and
    day of a date. The no-arg constructor constructs an instance for the current date, and
    the methods get(GregorianCalendar.YEAR), get(GregorianCalendar.
    MONTH), and get(GregorianCalendar.DAY_OF_MONTH) return the year,
    month, and day. Write a program to perform two tasks:
    1. Display the current year, month, and day.
    2. The GregorianCalendar class has the setTimeInMillis(long), which
    can be used to set a specified elapsed time since January 1, 1970. Set the value
    to 1234567898765L and display the year, month, and day
    */

    public static void main(String[] args) {

        GregorianCalendar kalendar = new GregorianCalendar();
        long kalendarYear = kalendar.get(Calendar.YEAR);
        long kalendarMonth = kalendar.get(Calendar.MONTH);
        long kalendarDay = kalendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(kalendarYear + " " + kalendarMonth + " " + kalendarDay);

        kalendar.setTimeInMillis(1234567898765L);
        
        long kalendarYear1 = kalendar.get(Calendar.YEAR);
        long kalendarMonth1 = kalendar.get(Calendar.MONTH);
        long kalendarDay1 = kalendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(kalendarYear1 + " " + kalendarMonth1 + " " + kalendarDay1);
    }
}

