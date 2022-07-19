package objekti.pekara;

import java.util.List;
import java.util.Scanner;

public class PekaraServis {

    public void dodajProizvodUListuProizvoda(List<Proizvod> listaProizvoda) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite naziv proizvoda: ");
        String nazivProizvoda = scanner.next();

        System.out.println("Unesite cijenu proizvda: ");

        int cijena = scanner.nextInt();
        Proizvod proizvod = new Proizvod(nazivProizvoda, cijena);
        listaProizvoda.add(proizvod);

    }

    public void ispisiProizvode(List<Proizvod> listaProizvoda) {
        listaProizvoda.forEach(System.out::println);
    }

    public void izbrisiProizvod(List<Proizvod> listaProizvoda, String imeProizvodaZaBrisanje) {
       int size = listaProizvoda.size();

        for (int i = 0; i < size; i++) {
            if (listaProizvoda.get(i).getNazivProizvoda().equals(imeProizvodaZaBrisanje)) {
                listaProizvoda.remove(i);
                break;
            }
        }
        /*listaProizvoda.forEach(proizvod -> {
            if (proizvod.getNazivProizvoda().equals(imeProizvodaZaBrisanje)) {
                listaProizvoda.remove(proizvod);
            }
        });
        System.out.println("Izbrisan je proizvod "+imeProizvodaZaBrisanje);
        listaProizvoda.forEach(System.out::println);*/
    }
}