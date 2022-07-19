package objekti.kurs;

import java.util.List;
import java.util.Scanner;

public class KursServis {


    public void dodajKurs(List<Kurs> kursevi) {
        System.out.println("Unesi ime kursa");
        String imeKursa = new Scanner(System.in).next();
        Kurs kurs = new Kurs(imeKursa);
        kursevi.add(kurs);
        System.out.println("Dodan je kurs " + imeKursa);
        kursevi.forEach(System.out::println);
    }

    public void dodajStudentaUKurs(List<Kurs> kusevi) {
        System.out.println("Unesi ime studenta");
        Scanner scanner = new Scanner(System.in);
        String imeStudenta = scanner.next();

        System.out.println("UnesiteImeKursa na koji zelite dodati studenta: " + imeStudenta);
        String imeKursa = scanner.next();

        System.out.println(imeKursa);

        scanner.close();
        int size = kusevi.size();
        for (int i = 0; i < size; i++) {
            if (kusevi.get(i).getNazivKursa().equals(imeKursa)) {
                Kurs pronadjeniKursNaOsnovuScannera = kusevi.get(i);
                Student student = new Student(imeStudenta);

                pronadjeniKursNaOsnovuScannera.getListaStudenataNaKursu().add(student);
            }
        }
        System.out.println("Dodan je student " + imeStudenta + " u kurs " + imeKursa);
        kusevi.forEach(System.out::println);
    }

    public void izbrišiKurs(List<Kurs> kursevi, String imeKursa) {
        kursevi.forEach(kurs -> {
            if (kurs.getNazivKursa().equals(imeKursa)) {
                kursevi.remove(kurs);
            }
        });
        System.out.println("Izbrisan je kurs " + imeKursa);
        kursevi.forEach(System.out::println);
    }

    public void ispisikurseve(List<Kurs> kurs) {
        System.out.println("Svi trenutni kursevi");
        kurs.forEach(System.out::println);
    }


}
