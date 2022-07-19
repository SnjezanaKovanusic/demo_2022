package generics;

public class Pair<T, E> {
    private final T one;
    private final E two;

    public Pair(T one, E two) {
        this.one = one;
        this.two = two;
    }

    public void writer() {
        System.out.println("Value of one: " + one);
        System.out.println("Value of two: " + two);
    }

    public static void main(String[] args) {
        Pair<Integer, Integer> pair = new Pair<>(1, 5);
        pair.writer();
        pair.sum(pair.one, pair.two);


    }

    public <e extends Number, t extends Number>
    void sum(t one, e two) {

        System.out.println(one.intValue() + two.intValue());
    }


}
