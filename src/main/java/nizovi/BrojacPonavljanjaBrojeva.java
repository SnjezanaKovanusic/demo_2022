package nizovi;

import java.util.Arrays;
import java.util.Scanner;

public class BrojacPonavljanjaBrojeva {
    /*(Count occurrence of numbers) Write a program that reads the integers between
1 and 50 and counts the occurrences of each. Assume the input ends with 0. Here
is a sample run of the program:
Enter the integers between 1 and 50: 2 5 6 5 4 3 23 43 2 0
2 occurs 2 times
3 occurs 1 time
4 occurs 1 time
5 occurs 2 times
6 occurs 1 time
12 occurs 0 time
23 occurs 1 time
43 occurs 1 time
Enter numbers: 1 2 3 2 1 6 3 4 5 2 3 6 8 9 9 0
The number of odd numbers: 8
The number of even numbers: 7
 Note if a number occurs more than one time, the plural word “times” is used in
the output.
    * */

    public static void main(String[] args) {
        main();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite brojeve izmedju 1 i 50! O je izlaz! ");
        int uneseniBroj = -1;
        int[] nizBrojeva = new int[51];

        //punim niz brojevima
        while (uneseniBroj != 0) {
            nizBrojeva[uneseniBroj = scanner.nextInt()]++;


        }
//todo pitati Voju za pojasnjenje :)
        for (int i = 0; i < 50; i++) {
            if (nizBrojeva[i] > 0) {
                String output = i + " pojavljuje " + nizBrojeva[i];
                output += nizBrojeva[i] > 1 ? " puta" : " puta";
                System.out.println(output);
            }

        }

    }

    public static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite brojeve izmedju 1 i 50! O je izlaz! ");
        int[] nizBrojeva = new int[50];
        int uneseniIndex;
        do {
            uneseniIndex = scanner.nextInt();
            nizBrojeva[uneseniIndex] += 1;
        }
        while (uneseniIndex != 0);

        for (int index = 1; index < 50; index++) {
            if (nizBrojeva[index] > 0) {
                System.out.println(index + " pojavljuje " + nizBrojeva[index] + "puta");
            }

        }
    }
}

