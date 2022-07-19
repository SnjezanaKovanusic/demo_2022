package objekti.kurs;

import java.util.ArrayList;

public class Kurs {
    private String nazivKursa;
    private ArrayList<Student> listaStudenataNaKursu;

    public Kurs(String nazivKursa) {
        this.nazivKursa = nazivKursa;
         listaStudenataNaKursu = new ArrayList<>();
     }

    public String getNazivKursa() {
        return nazivKursa;
    }

    public void setNazivKursa(String nazivKursa) {
        this.nazivKursa = nazivKursa;
    }

    public ArrayList<Student> getListaStudenataNaKursu() {
        return listaStudenataNaKursu;
    }

    @Override
    public String toString() {
        return "Kurs{" +
                "nazivKursa='" + nazivKursa + '\'' +
                ", listaStudenataNaKursu=" + listaStudenataNaKursu +
                '}';
    }
}
