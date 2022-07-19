package objekti.date;

import java.util.Random;

public class Randomv {


    /*(Use the Random class) Write a program that creates a Random object with seed
    1000 and displays the first 50 random integers between 0 and 100 using the
    nextInt(100) method.
        * */
    public static void main(String[] args) {
        Random random = new Random(1000);

        for (int i = 0; i < 50; i++) {
            int num = random.nextInt(100);
            if (i % 10 == 0) {
                System.out.println( " ");
            }
            System.out.print(num+ " ");
        }
    }
}

