package bankomat;

public class PareServis {


    public void skiniSumuSaBankomata(int suma, Pare pare) {
        //oduzeti u bankomatu sa stanja, npr 6000-350
        pare.setStanjeUBankomatu(pare.getStanjeUBankomatu() - suma);
    }

    public void isplatiPoApoenimaPoVelicini(int suma, Pare pare) {
        if (suma >= 100) {
            isplatiStotice(suma, pare);
        }
        if (suma >= 50 && suma <= 100) {
            isplatiPedesetice(suma, pare);
        }
        if (suma >= 10 && suma <= 50) isplatiDesetice(pare, suma);
    }

    private void isplatiPedesetice(int suma, Pare pare) {
        int brojPedeseticaUBankomatu = pare.getPedesetice();
        int brojPedeseticaUSumi = suma / 50;
        int ostatakPedeseticaZaIsplatiti;
        int ostatakSumeZaIsplatit;
        if (brojPedeseticaUSumi > brojPedeseticaUBankomatu) {
            ostatakPedeseticaZaIsplatiti = brojPedeseticaUSumi - brojPedeseticaUBankomatu;
            pare.setPedesetice(0);
            isplatiOstatakOdPedesetica(pare, ostatakPedeseticaZaIsplatiti);
        } else pare.setPedesetice(pare.getPedesetice() - brojPedeseticaUSumi);
        ostatakSumeZaIsplatit = suma % 50;
        isplatiDesetice(pare, ostatakSumeZaIsplatit);

    }

    private void isplatiOstatakOdPedesetica(Pare pare, int ostatakPedeseticaZaIsplatiti) {
        isplatiDesetice(pare, ostatakPedeseticaZaIsplatiti);
    }

    private void isplatiDesetice(Pare pare, int suma) {
        int brojDeseticaUBankomatu = pare.getDesetke();
        int brojDeseticaUSumi = suma / 10;

        if (brojDeseticaUSumi > brojDeseticaUBankomatu) {
            System.out.println("Nema dovoljno novca u bankomatu");

        } else pare.setDesetke(pare.getDesetke() - brojDeseticaUSumi);
    }

    private void isplatiStotice(int suma, Pare pare) {
        // suma 500
        int brojStoticaUBankomatu = pare.getStotice(); // npr 3
        int brojStoticaUSumi = suma / 100;// 500/100 = 5, mogu tri isplatiti
        int ostatakStoticaZaIsplatiti;
        int ostatakSumeZaIsplatit;
        //5-3
        if (brojStoticaUSumi > brojStoticaUBankomatu) {
            ostatakStoticaZaIsplatiti = brojStoticaUSumi - brojStoticaUBankomatu;//2
            pare.setStotice(0);
            isplatiOstatakStotica(pare, ostatakStoticaZaIsplatiti);
        } else pare.setStotice(pare.getStotice() - brojStoticaUSumi);
        ostatakSumeZaIsplatit = suma % 100;
        isplatiPedesetice(ostatakSumeZaIsplatit, pare);
    }

    private void isplatiOstatakStotica(Pare pare, int ostatakStoticaZaIsplatiti) {
        isplatiPedesetice(ostatakStoticaZaIsplatiti, pare);
    }
}
