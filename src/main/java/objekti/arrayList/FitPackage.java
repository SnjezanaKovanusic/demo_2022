package objekti.arrayList;

import java.util.ArrayList;
import java.util.List;

public class FitPackage {
    public static void main(String[] args) {
        //foo();
        List<Integer> list = new ArrayList<>();
        //fill list
        list.add(7);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(9);

        int weight = 10;
        int brIteracija = list.size();
        //iterate throw list
        while (list.size() > 0) {

            for (int i = 0; i < list.size(); i++) {
                   for (int j = i + 1; j < list.size(); j++) {
                       brIteracija =j;
                    if (list.get(i) + list.get(j) == weight) {
                        putIntoPackage(list.get(i), list.get(j));
                        list.remove(list.get(j));
                        list.remove(list.get(i));
                    }
                }

            }
            if (brIteracija==list.size()){
                jeLiMoguceZapakovati(list);
                break;
            }

        }

    }

    private static void jeLiMoguceZapakovati(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            {
                putIntoPackage(list.get(i));
            }

        }
    }


    private static void putIntoPackage(Integer integer) {
        System.out.println("Package contain: " + integer);
    }


    private static void putIntoPackage(Integer integer, Integer integer1) {
        System.out.println("Package contain: " + integer + " " + integer1);
    }

  /*  private static void foo() {

        List<Integer> list = new ArrayList<>();
        //fill list
        list.add(7);
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(6);
        list.add(3);


        for (int i = 0; i < list.size(); i++) {
            int start = 0;
            int index = start + 1;
            int weight = 10;

            while (true) {
                if (list.get(start) + list.get(index) == weight) {
                    putIntoPackage(list.get(start), list.get(index));
                    list.remove(list.get(start));
                    list.remove(list.get(index - 1));
                    break;
                }
                index++;
                if (index == list.lastIndexOf(list.get(i))) {
                    weight--;
                    break;

                }
                System.out.println("Package contain: " + list);
            }

        }*/
}



