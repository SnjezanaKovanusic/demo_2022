package nasljedjivanje.osoba;

import java.util.Date;

public class Zaposlenik extends Osoba {
    /*An employee
has an office, salary, and date hired.
Use the MyDate class defined in Programming Exercise 10.14 to create an object for date hired.
    * */
    private String kancelarija;
    private int plata;
    private MyDate datumZaposlenja;


    public Zaposlenik(String ime, String kancelarija, int plata) {
        super(ime);
        this.kancelarija = kancelarija;
        this.plata = plata;
        this.datumZaposlenja = new MyDate();

    }

    public Zaposlenik() {
    }



    public String getKancelarija() {
        return kancelarija;
    }

    public void setKancelarija(String kancelarija) {
        this.kancelarija = kancelarija;
    }

    public String getDatumZaposlenja() {
        return datumZaposlenja.getMonth() + " /" + datumZaposlenja.getDay() + "/" + datumZaposlenja.getYear();
    }

    public int getPlata() {
        return plata;
    }

    public void setPlata(int plata) {
        this.plata = plata;
    }

    @Override
    public String toString() {
        return "Zaposlenik{" +super.getIme()+ '\'' +
                "kancelarija='" + kancelarija + '\'' +
                ", plata=" + plata +
                ", datumZaposlenja=" + getDatumZaposlenja() +
                '}';
    }
}
