package bankomat;

import java.util.ArrayList;
import java.util.List;

public class Bankomat {
    private List<Klijent> klijenti;
    private String imeAdministratora;
    private Pare pare;

    public Bankomat(String administrator) {
        imeAdministratora = administrator;
        pare=new Pare();
        klijenti = new ArrayList<>();
    }

    public List<Klijent> getKlijenti() {
        return klijenti;
    }

    public void setKlijenti(List<Klijent> klijenti) {
        this.klijenti = klijenti;
    }

    public String getImeAdministratora() {
        return imeAdministratora;
    }

    public void setImeAdministratora(String imeAdministratora) {
        this.imeAdministratora = imeAdministratora;
    }

    public Pare getPare() {
        return pare;
    }

    public void setPare(Pare pare) {
        this.pare = pare;
    }

    @Override
    public String toString() {
        return "Bankomat{" +
                "klijenti=" + klijenti +
                ", imeAdministratora='" + imeAdministratora + '\'' +
                ", pare=" + pare +
                '}';
    }
}

