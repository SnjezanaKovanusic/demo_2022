package bankomat;

import java.util.Scanner;

public class BankomatServis {


    private final AdminServis adminServis = new AdminServis();
    private final KlijentServis klijentServis = new KlijentServis();
    private final PareServis pareServis = new PareServis();
    private final Scanner scanner = new Scanner(System.in);

    public void meni(Bankomat bankomat) {
        int izabranaRadnjaSaMenija = 0;
        int brojRacunaKorisnika;
        String pinKod;

        do {
            System.out.println("Dobrodosli na bankomat, unesite broj svog racuna: ");
            brojRacunaKorisnika = scanner.nextInt();

            System.out.println(" Unesite pin kod: ");
            pinKod = scanner.next();
        } while (!daLiJeOdgovarajucaDuzina(brojRacunaKorisnika));

        Klijent ulogovaniKlijent = getKlijnt(pinKod, brojRacunaKorisnika, bankomat);

        if (ulogovaniKlijent == null) {
            System.out.println("nemate klijenta u bazi");
        }

        assert ulogovaniKlijent != null;
        if (!isAdmin(ulogovaniKlijent)) {
            klijentMeni(bankomat, ulogovaniKlijent);
        }
        if (isAdmin(ulogovaniKlijent)) {
            adminMeni(bankomat);
        }
    }

    private void adminMeni(Bankomat bankomat) {
        int izabranaRadnjaSaMenija;
        System.out.println("Admin meni: ");
        do {
            adminMeni();

            izabranaRadnjaSaMenija = scanner.nextInt();

            switch (izabranaRadnjaSaMenija) {
                case 1 -> dodajNovogKlijeta(bankomat);
                case 2 -> ispisiSveKlijente(bankomat);
                case 3 -> izbrisiKlijenta(bankomat);
                case 4 -> dodajNovacNaKlijentovRacun(bankomat);
                case 5 -> napuniBankomatApoenima(bankomat.getPare());
                case 6 -> stanjeNovcaUBankomatu(bankomat.getPare());
                case 7 -> izlazIzBankomata();
            }

        } while (izabranaRadnjaSaMenija != 7);
    }

    private void klijentMeni(Bankomat bankomat, Klijent ulogovaniKlijent) {
        int izabranaRadnjaSaMenija;
        do {
            printWelcomeMesgForClient();

            izabranaRadnjaSaMenija = scanner.nextInt();

            switch (izabranaRadnjaSaMenija) {
                case 1 -> podizanje(ulogovaniKlijent, bankomat.getPare());
                case 2 -> transfer(ulogovaniKlijent, pareServis, bankomat, bankomat.getPare());
                case 3 -> stanjeNaRacunuKlijenta(ulogovaniKlijent);
                case 4 -> mijenjanjeSifre(ulogovaniKlijent);
                case 5 -> izlazIzBankomata();
            }
        } while (izabranaRadnjaSaMenija != 5);
    }

    private void stanjeNovcaUBankomatu(Pare pare) {
        adminServis.ispisivanjeStanjaNovcaUBankomatu(pare);
    }

    private void napuniBankomatApoenima(Pare pare) {
        adminServis.punjenjeBankomataPoApoenima(pare);
    }

    private void dodajNovacNaKlijentovRacun(Bankomat bankomat) {
        adminServis.dodajNovacNaKlijentovRacun(bankomat);
    }

    private void izbrisiKlijenta(Bankomat bankomat) {
        adminServis.brisanjeKlijenta(bankomat);
    }


    private void ispisiSveKlijente(Bankomat bankomat) {
        adminServis.ispisiKlijente(bankomat);
    }

    private void dodajNovogKlijeta(Bankomat bankomat) {
        adminServis.dodajNovogKlijenta(bankomat);
    }

    private void adminMeni() {
        System.out.println("Izaberite: \n 1. Dodaj Novog klijenta \n2. Ispisi sve klijente \n 3. Izbrisi klijenta \n4. " +
                "Dodaj novac na klijentov racun\n 5. Napuni bankomat novcanicama-apoenima\n 6. Ispisi stanje novca u bankomatu" +
                "\n 7. Izlaz iz aplikacije ");
    }

    private void printWelcomeMesgForClient() {
        System.out.println("Izaberite: \n 1. Podizanje novca \n2. Transfer novca\n 3. Stanje na racunu\n4. " +
                "Mijenjanje sifre\n 5. Izlaz iz bankomata ");
    }

    private void izlazIzBankomata() {
        System.out.println("Izlazite iz bankomata...");
    }

    private void stanjeNaRacunuKlijenta(Klijent ulogovaniKlijent) {
        System.out.println("Trenutno stanje na racunu klijenta: " + ulogovaniKlijent.getImeVlasnikaRacuna() + "iznosi: " + ulogovaniKlijent.getIznosNovcaNaRacunu());
    }

    private void mijenjanjeSifre(Klijent ulogovaniKlijent) {
        klijentServis.mijenjanjeSifre(ulogovaniKlijent);

    }

    private void transfer(Klijent ulogovaniKlijent, PareServis pareServis, Bankomat bankomat, Pare pare) {
        klijentServis.transferNovca(ulogovaniKlijent, pareServis, bankomat, pare);

    }

    private boolean isAdmin(Klijent ulogovaniKlijent) {
        return ulogovaniKlijent.isAdmin();
    }

    private Klijent getKlijnt(String pinKod, int brojRacunaKorisnika, Bankomat bankomat) {
        return adminServis.getKlijnt(pinKod, brojRacunaKorisnika, bankomat);
    }

    private void podizanje(Klijent klijent, Pare pare) {
        System.out.println("Unesite sumu novca za podizanje: ");
        int suma = scanner.nextInt();

        if (DaLiImaNovcaUBankomatuZaPodizanje(suma, pare)) {
            klijentServis.podizanjeNovca(klijent, suma);
            pareServis.skiniSumuSaBankomata(suma, pare);
            pareServis.isplatiPoApoenimaPoVelicini(suma, pare);
        } else System.out.println("Nema dovoljno novca za podizanje u bankomatu! ");
    }

    private boolean DaLiImaNovcaUBankomatuZaPodizanje(int suma, Pare pare) {
        return (pare.getStanjeUBankomatu() > suma);
    }


    private boolean daLiJeOdgovarajucaDuzina(int brojRacunaKorisnika) {
        String temp = String.valueOf(brojRacunaKorisnika);
        if (temp.length() == 5) {
            return true;
        }
        System.out.println("neodgovarajuca duzina");
        return false;
    }

    public void napuniPodacima(Bankomat bankomat) {
        adminServis.initKlijents(bankomat);
        adminServis.ispisiKlijente(bankomat);
        adminServis.ispisiAdmine(bankomat);
        adminServis.ispisivanjeStanjaNovcaUBankomatu(bankomat.getPare());
    }

}
