package bankomat;

import java.util.Random;

public class UtilPinCode {
    // generisati pinkode random od 5 karaktera


    public static String generisi() {
        Random random = new Random();
        String pinKod = "";
        for (int i = 0; i < 5; i++) {
            char karakter = (char) (random.nextInt(5) + 'a');
            pinKod += karakter;
        }
        return pinKod;
    }
}
