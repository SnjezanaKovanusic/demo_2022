package nizovi;

public class ReverseArray {
    /*(Reverse an array) The reverse method in Section 7.7 reverses an array by
copying it to a new array. Rewrite the method that reverses the array passed in
the argument and returns this array. Write a test program that prompts the user to
enter 10 numbers, invokes the method to reverse the numbers, and displays the
numbers
    * */
    public static void main(String[] args) {


        int nizUnesenihBrojeva[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverse(nizUnesenihBrojeva);
    }

    private static void reverse(int[] nizUnesenihBrojeva) {
        for (int i = nizUnesenihBrojeva.length-1; i>0; i--){
            System.out.print(nizUnesenihBrojeva[i]+" ");
        }
    }
}
