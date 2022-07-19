package nizovi;

public class PoredjenjeBrojeva {
    /*(Comparing numbers) Write a program that reads 11 integers, compares each
integer with the 11th integer, and displays whether the integers are “greater”,
“smaller”, or “equal” to the 11th integer
    * */
    public static void main(String[] args) {

        int nizBrojeva[] = {5, 6, 8, 12, 15, 88, 2, 7, 56, 10, 45, 11};
        final int brojKojiSePoredi = 11;
        for (int i = 0; i < nizBrojeva.length; i++) {
            if (nizBrojeva[i] > brojKojiSePoredi) {
                System.out.println(nizBrojeva[i] + " je veci od " + brojKojiSePoredi);
            } else if (nizBrojeva[i] < brojKojiSePoredi) {
                System.out.println(nizBrojeva[i] + " je manji od " + brojKojiSePoredi);
            } else {
                System.out.println(nizBrojeva[i] + " je jednak broju " + brojKojiSePoredi);
            }
        }
    }
}
