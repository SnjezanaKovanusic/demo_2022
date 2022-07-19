package nizovi;

import java.util.Arrays;
import java.util.Scanner;

public class IgraVjesala {
    /*(Game: hangman) Write a hangman game that randomly generates a word and
prompts the user to guess one letter at a time, as presented in the sample run.
Each letter in the word is displayed as an asterisk. When the user makes a correct
guess, the actual letter is then displayed. When the user finishes a word, display
the number of misses and ask the user whether to continue to play with another
word. Declare an array to store words, as follows:
// Add any words you wish in this array
String[] words = {"write", "that",...}
    * */


    public static void main(String[] args) {
        String unosKorisnikaZaNastavakIgre = "y";
        Scanner scanner = new Scanner(System.in);

        while (unosKorisnikaZaNastavakIgre.charAt(0) == 'y') {
            System.out.println("WELCOME TO VJESALA");
            String unsesenoSlovo;
            String[] nizRijeciZaPogadjanje = {"pas", "macka", "koka"};

            String rijecKojaSePogadja = dohvatiRijecZaPogadjanjeRandom(nizRijeciZaPogadjanje);

            char[] nizKojiPopunjavamo = new char[rijecKojaSePogadja.length()];
            fillWithStars(nizKojiPopunjavamo);

            boolean igraTraje = true;

            while (igraTraje) {
                System.out.println("Unesite slovo da popunite u rijeci: ");
                print(nizKojiPopunjavamo);
                unsesenoSlovo = scanner.next();
                for (int i = 0; i < rijecKojaSePogadja.length(); i++) {
                    if (unsesenoSlovo.charAt(0) == rijecKojaSePogadja.charAt(i)) {
                        System.out.print(unsesenoSlovo.charAt(0));
                        nizKojiPopunjavamo[i] = unsesenoSlovo.charAt(0);
                    }
                    boolean pogodak = daLiJePogodjenaRijec(rijecKojaSePogadja, nizKojiPopunjavamo);

                    if (pogodak) {
                        System.out.println("Cestitamo, pogodili ste trazenu rijec: " + rijecKojaSePogadja);

                        System.out.println("Da li zelite da nastavite, ako zelite da-pritisnite y a ako ne- pritisnite n");
                        unosKorisnikaZaNastavakIgre = scanner.next();
                        igraTraje = false;
                        if (unosKorisnikaZaNastavakIgre.charAt(0) == 'n'){
                            System.out.println("ENDE");
                            System.exit(200);
                        }

                    }

                }
            }

        }
    }


    private static boolean daLiJePogodjenaRijec(String rijecKojaSePogadja, char[] nizKojiPopunjavamo) {
        for (int i = 0; i < nizKojiPopunjavamo.length; i++) {
            if (nizKojiPopunjavamo[i] != rijecKojaSePogadja.charAt(i)) {
                return false;
            }
        }
        return true;
    }


    private static void fillWithStars(char[] nizKojiPopunjavamo) {
        Arrays.fill(nizKojiPopunjavamo, '*');
    }

    private static void print(char[] nizKojiPopunjavamo) {
        for (char c : nizKojiPopunjavamo) {
            System.out.print(c);
        }
        System.out.println();
    }

    private static String dohvatiRijecZaPogadjanjeRandom(String[] nizRijeciZaPogadjanje) {
        int index = (int) (Math.random() * nizRijeciZaPogadjanje.length);

        return nizRijeciZaPogadjanje[index];
    }
}



