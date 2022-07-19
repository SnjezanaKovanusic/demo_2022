package objekti.kurs;

import java.util.ArrayList;
import java.util.List;

public class Skola {
    private List<Student> studenti;
    private List<Kurs> kursevi;

    public Skola() {
        studenti = new ArrayList<>();
        kursevi = new ArrayList<>();
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    public List<Kurs> getKursevi() {
        return kursevi;
    }

    public void setKursevi(List<Kurs> kursevi) {
        this.kursevi = kursevi;
    }
}
