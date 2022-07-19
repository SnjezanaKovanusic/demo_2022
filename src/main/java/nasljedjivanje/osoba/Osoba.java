package nasljedjivanje.osoba;

public class Osoba {
    /*(The Person, Student, Employee, Faculty, and Staff classes) Design a
class named Person and its two subclasses named Student and Employee.
Make Faculty and Staff subclasses of Employee. A person has a name,
address, phone number, and e-mail address. A student has a class status (freshman, sophomore, junior, or senior).
Define the status as a constant.
 A faculty member has
office hours and a rank.
 A staff member has a title. Override the toString
method in each class to display the class name and the person’s name.
Draw the UML diagram for the classes and implement them. Write a test program
that creates a Person, Student, Employee, Faculty, and Staff, and invokes
their toString() methods.
    * */
    private String ime;
    private String adresa;
    private int brojTelefona;
    private String eMail;

    public Osoba(String ime, String adresa, int brojTelefona, String eMail) {
        this.ime = ime;
        this.adresa = adresa;
        this.brojTelefona = brojTelefona;
        this.eMail = eMail;
    }

    public Osoba(String ime) {
        this.ime = ime;
    }

    public Osoba() {
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(int brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "ime='" + ime + '\'' +
                ", adresa='" + adresa + '\'' +
                ", brojTelefona=" + brojTelefona +
                ", eMail='" + eMail + '\'' +
                '}';
    }
}
