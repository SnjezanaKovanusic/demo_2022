package generics;

import java.util.ArrayList;
import java.util.Collections;

public class SufleArray<E> {
    /*(Shuffle ArrayList) Write the following method that shuffles an ArrayList:
public static <E> void shuffle(ArrayList<E> list
    * */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Teslic");
        arrayList.add("Beograd");
        arrayList.add("Ugodnovic");
        arrayList.add("Cecava");

        shuffle(arrayList);

    }

    public static <E> void shuffle(ArrayList<E> list) {
        Collections.shuffle(list);
        System.out.println(list);
    }
}

