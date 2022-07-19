package objekti.machine;

import java.util.Scanner;

public class AcountService {


    public static int curentBallance(Acount acount) {
        return acount.getSumOfAcount();
    }

    public static void withdravMoney(Acount acount, int moneyForWithdrov) {
        int sumOfMoney = acount.getSumOfAcount() - moneyForWithdrov;
        acount.setSumOfAcount(sumOfMoney);
    }

    public static void depositeMoney(Acount acount, int moneyForDeposit) {
        int money = acount.getSumOfAcount() + moneyForDeposit;
        acount.setSumOfAcount(money);
    }

    public static Acount[] makeAcounts() {
        Acount[] acounts = new Acount[9];

        for (int i = 0; i < acounts.length; i++) {
            Acount acount = new Acount();

            int index = acount.getIndex();
            index ++;

            acount.setId(index);
            acounts[i] = acount;
        }
        return acounts;
    }

    public static void displayMenu() {
        System.out.println("Main menu\n" +
                "1: check balance\n" +
                "2: withdraw\n" +
                "3: deposit\n" +
                "4: exit");

    }

    public static void runAtmMachine() {
        System.out.println("Enter id: ");

        while (true) {

            Scanner scanner = new Scanner(System.in);
            int id = scanner.nextInt();
            if (ispravanId(id)) {
                Acount acount = izaberiAcount(id);
                while (true) {
                    displayMenu();
                    int korisnikovIzbor = scanner.nextInt();
                    izborSaMenija(korisnikovIzbor, acount);
                }
            }
            System.out.println("Neispravan id, pokusajte ponovo: ");
        }
    }

    private static void izborSaMenija(int izborSaMenija, Acount acount) {

        if (checkBalance(izborSaMenija, acount)) {

        }
        if (withdraw(izborSaMenija, acount)) {

        }
        if (deposit(izborSaMenija, acount)) {

        }
        if (exit(izborSaMenija)) {

        }

    }

    private static boolean exit(int izborSaMenija) {
        if (izborSaMenija == 4) {
            runAtmMachine();
        }
        return false;
    }

    private static boolean deposit(int izborSaMenija, Acount acount) {
        Scanner scanner = new Scanner(System.in);
        if (izborSaMenija == 3) {
            System.out.println("Unesite iznos za dodavanje novca: ");
            int iznosZaPolaganje = scanner.nextInt();
            depositeMoney(acount, iznosZaPolaganje);
        }
        return false;
    }

    private static boolean withdraw(int izborSaMenija, Acount acount) {
        Scanner scanner = new Scanner(System.in);
        if (izborSaMenija == 2) {
            System.out.println("Unesite iznos za podizanje: ");
            int iznosZaPodizanje = scanner.nextInt();
            withdravMoney(acount, iznosZaPodizanje);
        }
        return false;
    }

    private static boolean checkBalance(int izborSaMenija, Acount acount) {
        if (izborSaMenija == 1) {
             System.out.println("Check balance: " + acount.getSumOfAcount());
        }

        return false;
    }

    private static boolean ispravanId(int id) {
        return id > 0 & id <= 9;
    }

    private static Acount izaberiAcount(int id) {
        Acount[] acounts = makeAcounts();
        for (int i = 0; i < acounts.length; i++) {
            if (i == id) {
                return acounts[i];
            }
        }
        return null;
    }

}
