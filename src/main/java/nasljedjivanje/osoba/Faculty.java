package nasljedjivanje.osoba;

/*A faculty member has
office hours and a rank.
* */

public class Faculty extends Zaposlenik {
    private String sati;
    private String rang;


    public Faculty(String ime, String sati, String rang, String kancelarija, int plata) {
        super(ime, kancelarija, plata);
        this.sati = sati;
        this.rang = rang;
    }

    public Faculty(){}

    public String getSati() {
        return sati;
    }


    public void setSati(String sati) {
        this.sati = sati;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }

    @Override
    public String toString() {
        return "Faculty{" + super.toString()+
                "sati='" + sati + '\'' +
                ", rang='" + rang + '\'' +
                '}';
    }
}
