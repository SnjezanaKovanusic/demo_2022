package objekti.multyArray;

public class Cokolada {
    private String naziv;
    private int kolicina;

    public Cokolada(String naziv, int kolicina) {
        this.naziv = naziv;
        this.kolicina = kolicina;
    }
    public Cokolada (){}

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    @Override
    public String toString() {
        return "Cokolada{" +
                "naziv='" + naziv + '\'' +
                ", kolicina=" + kolicina +
                '}';
    }
}
