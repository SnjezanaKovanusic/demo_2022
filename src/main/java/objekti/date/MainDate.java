package objekti.date;

import java.util.Date;

public class MainDate {
    public static void main(String[] args) {
        /*(Use the Date class) Write a program that creates a Date object, sets its elapsed
time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000,
10000000000, and 100000000000, and displays the date and time using the
toString() method, respectively.
        * */
        Date date = new Date();

        for (long i = 10000; i < 100000000000L; i *= 10) {
            date.setTime(i);
            System.out.println(date.toString());
        }
    }
}
