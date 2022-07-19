package generics;

import java.util.ArrayList;

import static java.util.Collections.sort;

public class Sorting {
    /*(Sort ArrayList) Write the following method that sorts an ArrayList:
public static <E extends Comparable<E>>
 void sort(ArrayList<E> list
    * */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(2);
        sort(list);
    }

    public static <E extends Comparable<E>>
    void sort(ArrayList<E> list) {
       E curentMin;
       int curentMinIndex;

       for (int i = 0; i <list.size()-1; i++){
           curentMin= list.get(i);
           curentMinIndex= i;
           for (int j = i+1; j<list.size(); i++){
               if (curentMin.compareTo(list.get(j))>0){
                   curentMin=list.get(j);
                   curentMinIndex=j;
               }
           }

       }
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
