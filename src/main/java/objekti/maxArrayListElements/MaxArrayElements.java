package objekti.maxArrayListElements;

import java.util.ArrayList;


public class MaxArrayElements {
    /*(Maximum element in ArrayList) Write the following method that returns the
maximum value in an ArrayList of integers. The method returns null if the
list is null or the list size is 0.
public static Integer max(ArrayList<Integer> list)
Write a test program that prompts the user to enter a sequence of numbers ending
with 0 and invokes this method to return the largest number in the input.
    * */

    private ArrayList<Integer>list;

    public MaxArrayElements() {
       list=new ArrayList<Integer>();
    }

    public MaxArrayElements(ArrayList<Integer> list) {
        this.list = list;
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "MaxArrayElements{" +
                "list=" + list +
                '}';
    }
}
