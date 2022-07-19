package objekti.arrayList;

import java.util.ArrayList;
import java.util.Objects;

public class RemoveDuplicatesNumFromList {
    public
    static void main(String[] args) {
        /*(Remove duplicates) Write a method that removes the duplicate elements from
an array list of integers using the following header:

Write a test program that prompts the user to enter 10 integers to a list and displays the distinct integers in their input order and separated by exactly one space.
Here is a sample run:
        * */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(4);
        removeDuplicate(list);
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (Objects.equals(list.get(i), list.get(j))) {
                   list.remove(i);
                }
            }
        }
        System.out.println(list);
    }
}
