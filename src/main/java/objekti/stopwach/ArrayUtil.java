package objekti.stopwach;

public class ArrayUtil {

    public static int[] getRandomArray() {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            //  System.out.print(array[i]+" ");
        }
        return array;
    }

    public static void sortArray(int[] randomArray) {
        for (int i = 0; i < randomArray.length; i++) {
            for (int j = i + 1; j < randomArray.length; j++) {
                int tmp = 0;
                if (randomArray[i] > randomArray[j]) {
                    tmp = randomArray[i];
                    randomArray[i] = randomArray[j];
                    randomArray[j] = tmp;
                }
            }
            //   System.out.println(randomArray[i]);
        }

    }
}
