package objekti.machine;

public class Acount {
    private static int index = 0;

    private int id;
    private int sumOfAcount;

    Acount() {
        this.sumOfAcount = 100;
    }

    public int getSumOfAcount() {
        return sumOfAcount;
    }

    public void setSumOfAcount(int sumOfAcount) {
        this.sumOfAcount = sumOfAcount;
    }

    @Override
    public String toString() {
        return "Acount{" +
                "sumOfAcount=" + sumOfAcount +
                '}';
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        Acount.index = index;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
