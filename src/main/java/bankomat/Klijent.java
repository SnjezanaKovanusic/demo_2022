package bankomat;

public class Klijent {
    private int brojRacuna;
    private String imeVlasnikaRacuna;
    private String prezimeVlasnikaRacuna;
    private int iznosNovcaNaRacunu;
    private String pinKod;
    private boolean isAdmin;

    public Klijent() {
    }

    public Klijent(String imeVlasnikaRacuna, String prezimeVlasnikaRacuna, int id) {
        this.prezimeVlasnikaRacuna=prezimeVlasnikaRacuna;
        this.imeVlasnikaRacuna = imeVlasnikaRacuna;
        iznosNovcaNaRacunu = 1200;

    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getPrezimeVlasnikaRacuna() {
        return prezimeVlasnikaRacuna;
    }

    public void setPrezimeVlasnikaRacuna(String prezimeVlasnikaRacuna) {
        this.prezimeVlasnikaRacuna = prezimeVlasnikaRacuna;
    }

    public String getPinKod() {
        return pinKod;
    }

    public void setPinKod(String pinKod) {
        this.pinKod = pinKod;
    }



    public int getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(int brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public String getImeVlasnikaRacuna() {
        return imeVlasnikaRacuna;
    }

    public void setImeVlasnikaRacuna(String imeVlasnikaRacuna) {
        this.imeVlasnikaRacuna = imeVlasnikaRacuna;
    }

    public int getIznosNovcaNaRacunu() {
        return iznosNovcaNaRacunu;
    }

    public void setIznosNovcaNaRacunu(int iznosNovcaNaRacunu) {
        this.iznosNovcaNaRacunu = iznosNovcaNaRacunu;
    }

    @Override
    public String toString() {
        return "Klijent{" +
                "brojRacuna=" + brojRacuna +
                ", imeVlasnikaRacuna='" + imeVlasnikaRacuna + '\'' +
                ", prezimeVlasnikaRacuna='" + prezimeVlasnikaRacuna + '\'' +
                ", iznosNovcaNaRacunu=" + iznosNovcaNaRacunu +
                ", pinKod='" + pinKod + '\'' +
                '}';
    }
}
