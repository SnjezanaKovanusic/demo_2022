package nizovi;

public class RandomBroj {
    /*(Random number selector) Write a method that returns a random number from a
list of numbers passed in the argument. The method header is specified as follows:
public static int getRandom(int... numbers
    * */
    public static void main(String[] args) {


        int[] nizBrojeva = {1, 58, 3, 4, 92, 6, 77, 8, 9};


        System.out.println(dohvatiRandomBroj(nizBrojeva));
    }

    private static int dohvatiRandomBroj(int[] nizBrojeva) {
        int randomBroj = 0;
        for (int i = 0; i < nizBrojeva.length; i++) {
            randomBroj = (int) (Math.random() * i);
            System.out.println(nizBrojeva[randomBroj]);         }
        return nizBrojeva[randomBroj];
    }
}