package objekti.arrayList;

import java.util.ArrayList;

public class SumArrayList {
    /*(Sum ArrayList) Write the following method that returns the sum of all numbers in an ArrayList:

Write a test program that prompts the user to enter five numbers, stores them in
an array list, and displays their sum.
    * */
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(5.0);
        list.add(10.0);
        list.add(5.3);

        System.out.println(sum(list));
    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (Double aDouble : list) {
            sum += aDouble;
        }
        return sum;
    }
}
