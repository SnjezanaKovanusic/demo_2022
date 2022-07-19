package objekti.multyArray;

import java.util.ArrayList;
import java.util.List;

public class MultyMain {
    public static void main(String[] args) {
        Cokolada cokolada = new Cokolada("milka", 100);
        Krompir krompir = new Krompir("mladi", "glamocki", 5);
        String nazivProdavnice = "Market";

        List<Object>korpa = new ArrayList<>();
        korpa.add(cokolada);
        korpa.add(krompir);
        korpa.add(nazivProdavnice);
        System.out.println(korpa);

    }
}
