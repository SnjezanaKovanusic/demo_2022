package nizovi;

public class BrojacParnihINeparnihBrojeva {
    /*(The number of even numbers and odd numbers) Write a program that reads ten
integers, and then display the number of even numbers and odd numbers. Assume
that the input ends with 0. Here is the sample run of the program.
 1 2 3 2 1 6 3 4 5 2 3 6 8 9 9 0    * */
    public static void main(String[] args) {

        int[] nizBrojeva = {1, 1, 1, 2, 2, 2};
        int brojacParnih = 0;
        int brojacNeparnih = 0;

        for (int e : nizBrojeva) {
            if (e % 2 == 0) {
                brojacParnih++;

            } else
                brojacNeparnih++;
        }
        System.out.println("Broj parnih brojeva je: " + brojacParnih + "\n" + "Broj neparnih brojeva je: " + brojacNeparnih);
    }
}
