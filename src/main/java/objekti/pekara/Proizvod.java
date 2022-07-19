package objekti.pekara;

public class Proizvod {
    private String nazivProizvoda;
    private int cijenaProizvoda;

    public Proizvod(String nazivProizvoda, int cijenaProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
        this.cijenaProizvoda = cijenaProizvoda;
    }

    public Proizvod() {
    }

    public String getNazivProizvoda() {
        return nazivProizvoda;
    }

    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }

    public int getCijenaProizvoda() {
        return cijenaProizvoda;
    }

    public void setCijenaProizvoda(int cijenaProizvoda) {
        this.cijenaProizvoda = cijenaProizvoda;
    }

    @Override
    public String toString() {
        return "Proizvod{" +
                "nazivProizvoda='" + nazivProizvoda + '\'' +
                ", cijenaProizvoda=" + cijenaProizvoda +
                '}';
    }
}
