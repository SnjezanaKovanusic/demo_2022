package nizovi;

public class NajveciElementUNizu {
    /*(Find the largest element) Write a method that finds the largest element in an array
of double values using the following header:
public static double max(double[] array)
 Write a test program that prompts the user to enter ten numbers, invokes this
method to return the maximum value, and displays the maximum value. Here is
a sample run of the program:
Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2
The minimum number is: 6
    * */
    public static void main(String[] args) {
        double niz[] = {1.9, 2.5, 3.7, 2, 1.5, 6, 3, 4, 5, 2};
        double maxBr = max(niz);
        System.out.println(maxBr);


    }

    public static double max(double niz[]) {
        double max = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > max) {
                max = niz[i];
            }
        }
        return max;
    }
}
