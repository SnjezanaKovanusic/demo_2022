package objekti.kurs;

public class SkolaMain {
    public static void main(String[] args) {
        Skola skola = new Skola();

        KursServis kursServis = new KursServis();
        kursServis.dodajKurs(skola.getKursevi());

        kursServis.dodajStudentaUKurs(skola.getKursevi());

    }
}
