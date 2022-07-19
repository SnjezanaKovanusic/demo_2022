package bankomat;

import java.util.List;
import java.util.Scanner;

public class KlijentServis {

    Scanner scanner = new Scanner(System.in);

    public void podizanjeNovca(Klijent klijent, int sumaNovcaZaPodizanje) {

        int stanjeNovcaNaRacunu = klijent.getIznosNovcaNaRacunu();
        klijent.setIznosNovcaNaRacunu(stanjeNovcaNaRacunu - sumaNovcaZaPodizanje);
    }


    public void transferNovca(Klijent klijent, PareServis pareServis, Bankomat bankomat, Pare pare) {

        System.out.println("Unesite racun za transfer novca: ");
        int brojRacunaZaTransfer = scanner.nextInt();

        Klijent klijentKojemSeVrsiTransfer = pronadjiKlijentaZaTrfansfer(brojRacunaZaTransfer, bankomat.getKlijenti());

        System.out.println("Unesite sumu novca za transfer: ");
        int sumaNovcaZaTransfer = scanner.nextInt();


        if (klijent.getIznosNovcaNaRacunu() > sumaNovcaZaTransfer) {
            int sumaNakonSkidanjaNovcaSaRacunaKorisnika = klijent.getIznosNovcaNaRacunu() - sumaNovcaZaTransfer;
            klijent.setIznosNovcaNaRacunu(sumaNakonSkidanjaNovcaSaRacunaKorisnika);
            assert klijentKojemSeVrsiTransfer != null;

            int sumaNakonDodavanjaNovcaSaRacunaKorisnika = klijentKojemSeVrsiTransfer.getIznosNovcaNaRacunu() + sumaNovcaZaTransfer;
            klijentKojemSeVrsiTransfer.setIznosNovcaNaRacunu(sumaNakonDodavanjaNovcaSaRacunaKorisnika);

            pareServis.skiniSumuSaBankomata(sumaNovcaZaTransfer, pare);


        } else System.out.println("Nemate dovoljno novca na racunu! ");
    }

    private Klijent pronadjiKlijentaZaTrfansfer(int brojRacunaZaTransfer, List<Klijent> klijenti) {
        for (Klijent klijent : klijenti
        ) {
            if (klijent.getBrojRacuna() == brojRacunaZaTransfer) {
                return klijent;
            }
        }
        System.out.println("Nepostojeci racun klijenta za transfer ");
        return null;

    }

    public void mijenjanjeSifre(Klijent klijent) {

        System.out.println("Unesite novi pin kod, koji se sastoji od 5 karaktera: ");
        String pin = scanner.next();

        if (daLiJeVazeciPin(pin)) {
            klijent.setPinKod(pin);
            System.out.println(klijent.getPinKod());
        } else System.out.println("Neodgovarajuca duzina ili pin ne sadrzi samo slova ");

    }

    private boolean daLiJeVazeciPin(String pin) {

        return daLiJeOdgovarajucaDuzina(pin) && daLiSadrziSamoSlova(pin);

    }

    private boolean daLiSadrziSamoSlova(String pin) {
        boolean result = pin.matches("[a-zA-Z]+");
        return result;
    }

    private boolean daLiJeOdgovarajucaDuzina(String pin) {
        boolean result = pin.length() == 5;
        return result;
    }
}


