package nasljedjivanje.osoba;

public class Student extends Osoba {
    /*A student has a class status (freshman, sophomore, junior, or senior).
Define the status as a constant.
    * */
    public final static int freshman = 0;
    public final static int sophomore = 1;
    public final static int junior = 2;
    public final static int senior = 3;
    private int status;


    public Student(String ime, String adresa, int brojTelefona, String email, int status) {
        super(ime, adresa, brojTelefona, email);
        this.status = status;
    }

    public String getStatus() {
        return switch (status) {
            case 1 -> "freshman";
            case 2 -> "sophomore";
            case 3 -> "junior";
            case 4 -> "senior";
            default -> "Unknown";
        };
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "status=" + getStatus();
    }
}
