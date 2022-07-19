package objekti.pekara;

import java.util.List;

public class PekaraMain {
    public static void main(String[] args) {
        Pekara pekara = new Pekara("Vojo");
        ProizvodServis proizvodServis = new ProizvodServis();
        PekaraServis pekaraServis = new PekaraServis();

        pekaraServis.dodajProizvodUListuProizvoda(pekara.getListaProizvoda());
        pekaraServis.dodajProizvodUListuProizvoda(pekara.getListaProizvoda());


        pekaraServis.ispisiProizvode(pekara.getListaProizvoda());

        pekaraServis.izbrisiProizvod(pekara.getListaProizvoda(), "kifla");

        pekaraServis.ispisiProizvode(pekara.getListaProizvoda());


    }



}
