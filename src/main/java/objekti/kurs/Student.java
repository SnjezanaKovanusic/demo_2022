package objekti.kurs;

public class Student {
    private static String ime;
    private int brojIndeksa;
    private static int index = 0;

    public Student(String name, int brojIndeksa) {
        this.ime = name;
        this.brojIndeksa = brojIndeksa;
    }
    public Student(String name){
        ime = name;

    }

    public static String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        Student.index = index;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + ime + '\'' +
                ", brojIndeksa =" + brojIndeksa +
                '}';
    }
}
