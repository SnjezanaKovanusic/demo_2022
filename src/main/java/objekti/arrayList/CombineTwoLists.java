package objekti.arrayList;

import java.util.ArrayList;

public class CombineTwoLists {
    public static void main(String[] args) {
        /*(Combine two lists) Write a method that returns the union of two array lists of
integers using the following header:
public static ArrayList<Integer> union(
 ArrayList<Integer> list1, ArrayList<Integer> list2
        * */

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(4);
        list2.add(5);
        list2.add(6);

        list1.addAll(list2);

        System.out.println(list1);
    }
}
