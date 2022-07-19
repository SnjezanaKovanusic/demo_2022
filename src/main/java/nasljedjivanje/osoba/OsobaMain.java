package nasljedjivanje.osoba;

public class OsobaMain {
    public static void main(String[] args) {
        Student student = new Student("Mirko", "Karadjordjeva", 065, "alkfl", 2);
        System.out.println(student);

        Zaposlenik zaposlenik = new Zaposlenik("mirko", "telic",100);
        System.out.println(zaposlenik);

        Faculty faculty = new Faculty("janko", "8", "spremac", "teslic",100);
        System.out.println(faculty);
    }
}
