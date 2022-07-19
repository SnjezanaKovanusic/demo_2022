package exceptions;

public class Month {
    String name;
    int days;

    public Month(String name, int days) {
        this.name = name;
        this.days = days;
    }

    @Override
    public String toString() {
        return "Month{" +
                "name='" + name + '\'' +
                ", days=" + days +
                '}';
    }
}
