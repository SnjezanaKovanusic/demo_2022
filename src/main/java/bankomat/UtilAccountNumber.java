package bankomat;

import java.util.Random;

public class UtilAccountNumber {


    public static int generisi() {

        Random random = new Random();
        int racunKlijenta = random.nextInt(90000)+10000;
        return racunKlijenta;
    }
}

