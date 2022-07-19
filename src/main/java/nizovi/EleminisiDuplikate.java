package nizovi;

import java.io.OptionalDataException;

public class EleminisiDuplikate {
    /*(Eliminate duplicates) Write a method that returns a new array by eliminating the
duplicate values in the array using the following method header:
public static int[] eliminateDuplicates(int[] list)
 Write a test program that reads in 10 integers, invokes the method, and displays
the distinct numbers separated by exactly one space. Here is a sample run of the
program:
Enter 10 numbers: 1 2 3 2 1 6 3 4 5 2
The distinct numbers are: 1 2 3 6 4 5
    * */
    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2};

        int[] listaBezDuplih = eliminateDuplicates(lista);

        for (int number: listaBezDuplih) {
            System.out.print(number+ " ");

        }


    }

    public static int[] eliminateDuplicates(int[] list) {
        //int[] lista = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2};
        int index = 0;
        int[] uniqueElementsList = new int[list.length];
        int[] isti = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] != list[j]) {
                    System.out.println(list[i] +"!="+list[j]);
                    isti[i]=list[i];
                }
                if (list[i] == list[j]) {
                    System.out.println(list[i] +"=="+list[j]);
                    uniqueElementsList[i]=0;
                }

                uniqueElementsList[i]= list[i];

            }


        }
        return uniqueElementsList;
    }
}




