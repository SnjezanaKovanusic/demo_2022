package generics;

import java.util.ArrayList;

public class MinArray<E> {
    /*(Smallest element in ArrayList) Write the following method that returns the
smallest element in an ArrayList:
public static <E extends Comparable<E>> E min(ArrayList<E> list
    * */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(1);
        Integer minElement = min(list);
        System.out.println(minElement);
        Integer maxElement = max(list);
        System.out.println(maxElement);
    }

    public static <E extends Comparable<E>> E min(ArrayList<E> list) {
        E min = list.get(0);
        for (E e : list) {
            if (min.compareTo(e) > 0) {
                min = e;
            }
        }
        return min;
    }

    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        E max = list.get(0);
        for (E e : list) {
            if (max.compareTo(e) < 0) {
                max = e;
            }
        }
        return max;
    }
}
