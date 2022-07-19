package abstractClass.averageArray;

import java.util.ArrayList;

import static java.lang.System.*;

public class AverageArray implements Comparable<Number> {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(5.0);
        list.add(3.0);
        list.add(1.0);
        list.add(1.0);


        out.println(list);
        average(list);

    }

    private static void average(ArrayList<Number> list) {
        double average = 0;
        for (Number item : list
        ) {

            average += item.doubleValue();
        }
        out.println(average/ list.size());
    }

    @Override
    public int compareTo(Number o) {

        return 0;
    }


/*
    @Override
    public static int compareTo(Number o) {
        return 0;
    }*/
}
