package objekti.maxArrayListElements;

import java.util.Arrays;
import java.util.Scanner;

public class MaxService {
    MaxArrayElements maxArrayElements = new MaxArrayElements();

    public void enterNumberToArray() {

        System.out.println("Enter number, ends with 0: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        while (input != 0) {

            maxArrayElements.getList().add(input);
            input = scanner.nextInt();
        }
    }

    public void printArray() {
        for (int i = 0; i < maxArrayElements.getList().size(); i++) {
            System.out.println(maxArrayElements.getList().get(i));
        }
    }

    public void printMaxElementInArray() {
        int max = 0;
        for (int i = 0; i < maxArrayElements.getList().size(); i++) {
            int index = maxArrayElements.getList().get(i);
            if (index > max) {
                max = index;
            }
        }
        System.out.println(max);

    }
}

