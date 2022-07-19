package model;

public class ValidacijaKreditneKartice {
    public static void main(String[] args) {
/* For example, the number 4388576018402626 is invalid, but the
number 4388576018410707 is valid.
Write a program that prompts the user to enter a credit card number as a long
integer. Display whether the number is valid or invalid. Design your program to
use the following methods:
 /**  */
        Long uneseniBroj = 4388576018410707L;
        validiraj(uneseniBroj);
    }

    public static boolean validiraj(Long broj) {
  return daLiJeValidan(broj);
    }

    private static boolean daLiJeValidan(Long broj) {
        return daLiJeSumaValidna(broj) && daLiPocinjeOdgovarajucimBrojem(broj)
                && daLiJeOdgovarajucaDuzina(broj);
    }

    public static boolean daLiPocinjeOdgovarajucimBrojem(Long broj) {
        return broj.toString().startsWith(String.valueOf(4)) ||
                broj.toString().startsWith(String.valueOf(5)) ||
                broj.toString().startsWith(String.valueOf(37)) ||
                broj.toString().startsWith(String.valueOf(6));
    }

    public static boolean daLiJeSumaValidna(Long brojKartice) {
        int suma = sumaParnihINeparnihBrojeva(brojKartice);
        return suma % 10 == 0;
    }

    public static int sumaParnihINeparnihBrojeva(Long uneseniBroj) {
        int sumaParnih = sumaParnihBrojeva(uneseniBroj);
        int sumaNeparnih = sumaNeparnihBrojeva(uneseniBroj);
        return sumaParnih + sumaNeparnih;
    }

    public static int sumaNeparnihBrojeva(Long broj) {
        String nizBrojeva = broj.toString();
        int suma = 0;
        for (int i = 0; i < nizBrojeva.length(); i++) {
            if (i % 2 != 0) {
                char c = nizBrojeva.charAt(i);
                suma += Integer.parseInt(String.valueOf(c));
            }
        }
        return suma;
    }

    public static boolean daLiJeOdgovarajucaDuzina(long brojKartice) {
        int duzinaKartice = String.valueOf(brojKartice).length();
        int maxDuzina = 16;
        int min = 13;
        return duzinaKartice <= maxDuzina && duzinaKartice >= min;
    }

    public static int sumaParnihBrojeva(Long broj) {
        String nizBrojeva = broj.toString();
        int suma = 0;
        int sumaDvocifrenih = 0;
        for (int i = 0; i < nizBrojeva.length(); i++) {
            if (i % 2 == 0) {
                char c = nizBrojeva.charAt(i);

                if (Integer.parseInt(String.valueOf(c)) * 2 >= 10) {
                    sumaDvocifrenih += sumaDvocifrenihBrojeva(Integer.parseInt(String.valueOf(c)));
                } else
                    suma += Integer.parseInt(String.valueOf(c)) * 2;
            }
        }
        return suma + sumaDvocifrenih;
    }

    public static int sumaDvocifrenihBrojeva(Integer broj) {
        String unos = broj.toString();
        int suma = 0;
        int zbirBrojeva;
        int ostatak = 0;
        for (int i = 0; i < unos.length(); i++) {
            zbirBrojeva = Integer.parseInt(String.valueOf(unos.charAt(i))) * 2;
            ostatak = zbirBrojeva % 10;
            zbirBrojeva /= 10;
            suma += zbirBrojeva + ostatak;
        }
        return suma;
    }

    public static boolean nekaNovaValidacija(Long validanBrojKartice) {
        return true;
    }
}
