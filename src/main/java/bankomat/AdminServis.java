package bankomat;

import java.util.List;
import java.util.Scanner;

public class AdminServis {

    Scanner scanner = new Scanner(System.in);


    public List<Klijent> initKlijents(Bankomat bankomat) {

        Klijent klijent = new Klijent("Marko", "Markovic", 1);
        Klijent klijent1 = new Klijent("Janko", "Jankovic", 2);
        Klijent klijent2 = new Klijent("Mirko", "Mirkovic", 3);
        Klijent admin = new Klijent("Pero", "Peric", 1);

        klijent.setPinKod(UtilPinCode.generisi());
        klijent.setBrojRacuna(UtilAccountNumber.generisi());

        klijent1.setPinKod(UtilPinCode.generisi());
        klijent1.setBrojRacuna(UtilAccountNumber.generisi());

        klijent2.setPinKod(UtilPinCode.generisi());
        klijent2.setBrojRacuna(UtilAccountNumber.generisi());

        admin.setPinKod(UtilPinCode.generisi());
        admin.setBrojRacuna(UtilAccountNumber.generisi());
        admin.setAdmin(true);

        bankomat.getKlijenti().add(klijent);
        bankomat.getKlijenti().add(klijent1);
        bankomat.getKlijenti().add(klijent2);
        bankomat.getKlijenti().add(admin);

        return bankomat.getKlijenti();

    }

    public void dodajNovogKlijenta(Bankomat bankomat) {

        System.out.println("Unesite ime");
        String ime = scanner.next();

        System.out.println("Unesite prezime");
        String prezime = scanner.next();

        System.out.println("Unesite id");
        int id = scanner.nextInt();

        Klijent klijent = new Klijent(ime, prezime, id);

        int racun = UtilAccountNumber.generisi();

        if (PostojiRacun(racun, bankomat)) {
            klijent.setBrojRacuna(dodjeliNoviRacun(klijent));
        }

        klijent.setPinKod(UtilPinCode.generisi());
        klijent.setBrojRacuna(racun);

        bankomat.getKlijenti().add(klijent);
    }

    private int dodjeliNoviRacun(Klijent klijent) {
        int postojeciRacun;
        int racun;
        do {
            postojeciRacun = klijent.getBrojRacuna();
            racun = UtilAccountNumber.generisi();
        } while (postojeciRacun == racun);
        return racun;
    }

    private boolean PostojiRacun(int racun, Bankomat bankomat) {

        for (Klijent klijent : bankomat.getKlijenti()) {
            if (klijent.getBrojRacuna() == racun) {
                return true;
            }
        }
        return false;
    }

    public void ispisiKlijente(Bankomat bankomat) {
        for (Klijent klijent : bankomat.getKlijenti()) {
            if (klijent.isAdmin()) {
                continue;
            }
            System.out.println(klijent);
        }

    }

    public void ispisiAdmine(Bankomat bankomat) {
        for (Klijent klijent : bankomat.getKlijenti()) {
            if (klijent.isAdmin()) {
                System.out.println(klijent);
            }
        }
    }

    public List<Klijent> brisanjeKlijenta(Bankomat bankomat) {

        System.out.println("Unesite broj racuna klijenta za brisanje: ");
        int brojRacunaKlijenta = scanner.nextInt();

        bankomat.getKlijenti().removeIf(klijent -> klijent.getBrojRacuna() == brojRacunaKlijenta);
        return bankomat.getKlijenti();
    }

    public void dodajNovacNaKlijentovRacun(Bankomat bankomat) {
        System.out.println("Unesite broj racuna klijenta za dodavanje novca: ");
        int brojRacunaKlijenta = scanner.nextInt();

        System.out.println("Unesite iznos novca koji cete dodati na racun");
        int iznosNovcaKojiSeDodajeNaKlijentovRacun = scanner.nextInt();

        for (Klijent klijent : bankomat.getKlijenti()) {
            if (klijent.getBrojRacuna() == brojRacunaKlijenta) {
                int stanjeNaRacunu = klijent.getIznosNovcaNaRacunu();
                klijent.setIznosNovcaNaRacunu(stanjeNaRacunu + iznosNovcaKojiSeDodajeNaKlijentovRacun);
            }
        }
    }


    public void punjenjeBankomataPoApoenima(Pare pare) {

        System.out.println("Unesite broj za punjenje zeljnog apoena : 1- stotice, 2-pedesetice, 3-desetice");
        int izborKorisnika = scanner.nextInt();
        punjenje(pare, izborKorisnika);
    }

    private void punjenje(Pare pare, int apoen) {
        System.out.println("Unesite broj apoena koji želite napuniti: ");
        int apoeni = scanner.nextInt();
        switch (apoen) {
            case 1 -> {
                pare.setStotice(pare.getStotice() + apoeni);
                pare.setStanjeUBankomatu(pare.getStanjeUBankomatu() + (apoeni * 100));
            }
            case 2 -> {
                pare.setPedesetice(pare.getPedesetice() + apoeni);
                pare.setStanjeUBankomatu(pare.getStanjeUBankomatu() + (apoeni * 50));
            }
            case 3 -> {
                pare.setDesetke(pare.getDesetke() + apoeni);
                pare.setStanjeUBankomatu(pare.getStanjeUBankomatu() + (apoeni * 10));
            }
        }
    }


    public void ispisivanjeStanjaNovcaUBankomatu(Pare pare) {
        System.out.println("Ukupno stanje u bankomatu iznosi: " + pare.getStanjeUBankomatu() +
                "\n 1. stotice: " + pare.getStotice() +
                "\n 2. pedesetice: " + pare.getPedesetice() +
                "\n 3. desetice: " + pare.getDesetke());
    }

    public Klijent getKlijnt(String pinKod, int brojRacunaKorisnika, Bankomat bankomat) {
        return bankomat.getKlijenti().stream()
                .filter(klijent -> klijent.getBrojRacuna() == brojRacunaKorisnika && klijent.getPinKod().equals(pinKod)).findFirst().orElse(null);
    }
}
