package objekti.multyArray;

public class Krompir {
    private String starost;
    private String vrsta;
    private  int kolicina;

    public Krompir (){

    }

    public Krompir(String starost, String vrsta, int kolicina) {
        this.starost = starost;
        this.vrsta = vrsta;
        this.kolicina = kolicina;
    }

    public String getStarost() {
        return starost;
    }

    public void setStarost(String starost) {
        this.starost = starost;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    @Override
    public String toString() {
        return "Krompir{" +
                "starost='" + starost + '\'' +
                ", vrsta='" + vrsta + '\'' +
                ", kolicina=" + kolicina +
                '}';
    }
}
