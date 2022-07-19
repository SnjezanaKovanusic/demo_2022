package exceptions;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Months {
    /*(ArrayIndexOutOfBoundsException) Using the two arrays shown below,
write a program that prompts the user to enter an integer between 1 and 12 and
then displays the months and its number of days corresponding to the integer
entered. Your program should display “wrong number” if the user enters a
wrong number by catching ArrayIndexOutOfBoundsException.
    * */
    public static void main(String[] args) {

        Month[] months = {new Month("January", 31),
                new Month("February", 28), new Month("March", 31), new Month("April", 30),
                new Month("May", 31), new Month("June", 30), new Month("July", 31), new Month("August", 31),
                new Month("September", 30), new Month("October", 31), new Month("November", 30)
                , new Month("December", 31)};


        Scanner scanner = new Scanner(System.in);
        System.out.println("Entere number 1 to 12: ");

        int enteredNum;

        try {
            enteredNum = scanner.nextInt();
            Month month = months[enteredNum-1];
            System.out.println(month);

        } catch (InputMismatchException e) {
            System.out.println("Try again. you must enter number");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Try again. (Incorrect input: You have to enter number 1-12 ");
        }
    }
}





