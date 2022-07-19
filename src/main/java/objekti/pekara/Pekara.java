package objekti.pekara;

import java.util.ArrayList;
import java.util.List;

public class Pekara {
    private String imeVlasnika;
    private List<Proizvod> listaProizvoda;

    public Pekara(String imeVlasnika) {
        this.imeVlasnika = imeVlasnika;
        listaProizvoda = new ArrayList<>();
    }

    public Pekara() {
    }

    public String getImeVlasnika() {
        return imeVlasnika;
    }

    public void setImeVlasnika(String imeVlasnika) {
        this.imeVlasnika = imeVlasnika;
    }

    public List<Proizvod> getListaProizvoda() {
        return listaProizvoda;
    }

    public void setListaProizvoda(List<Proizvod> listaProizvoda) {
        this.listaProizvoda = listaProizvoda;
    }
}
