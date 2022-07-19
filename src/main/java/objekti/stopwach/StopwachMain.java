package objekti.stopwach;

public class StopwachMain {
    public static void main(String[] args) {

        Stopwatch stopwatch = new Stopwatch();
        /*Напишите програм за тестирање
који мери време извршења сортирања 100.000 бројева коришћењем сортирања по избору.
        * */
//napravi random niz brojeva

        int[] randomArray = ArrayUtil.getRandomArray();

        // pokreni stopericu
        stopwatch.start();

        // sortiraj niz
        ArrayUtil.sortArray(randomArray);

        //zaustavi stopericu
        stopwatch.stop();

        stopwatch.getElapsedTime();

    }

}

