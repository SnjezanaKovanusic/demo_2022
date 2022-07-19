package nizovi;

public class ProsjekBrojevaUNizu {
    /*(Average an array) Write two overloaded methods that return the average of an
array with the following headers:
public static int average(int[] array)
public static double average(double[] array)
 Write a test program that prompts the user to enter 10 double values, invokes this
method, then displays the average value
    * */
    public static void main(String[] args) {
        int niz[] = {10, 10, 10};
        double nizDec[] = {1, 1, 1, 1};

        int prosjekCijelihBrojeva = prosjek(niz);
        double prosjekDecimalnihBrojeva = prosjek(nizDec);

        System.out.println(prosjekCijelihBrojeva);
        System.out.println(prosjekDecimalnihBrojeva);
    }

    private static int prosjek(int[] niz) {
        int prosjek = 0;
        int brojac = 0;
        for (int i = 0; i < niz.length; i++) {
            prosjek += niz[i];
            brojac++;
        }
        return prosjek / brojac;
    }

    private static double prosjek(double[] niz) {
        double prosjek = 0;
        int brojac = 0;
        for (int i = 0; i < niz.length; i++) {
            prosjek += niz[i];
            brojac++;
        }
        return prosjek / brojac;
    }
}
