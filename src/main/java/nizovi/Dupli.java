package nizovi;

import java.util.Arrays;

public class Dupli {
    public static void main(String[] args) {
        int[] niz = {1, 2, 3, 2, 5, 1, 2, 5};

        int[] jedinstveniNiz = dohvatiNizBezDuplih(niz);
        System.out.println(Arrays.toString(jedinstveniNiz));

    }

    private static int[] dohvatiNizBezDuplih(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            for (int j = i + 1; j < niz.length; j++) {
                if (niz[i] == niz[j]) {
                    niz[j] = 0;
                }
            }
        }


        return niz;
    }

}

/* private static Integer[] removeDuplicates(Integer[] origArray) {

    for (int j = 0; j < origArray.length - 1; j++) {
      for (int i = j + 1; i < origArray.length - 1; i++) {
        if (origArray[j] == origArray[i]) {
          origArray[i] = null;
        }
      }
    }

    origArray[origArray.length - 1] = null;

    return origArray;
* */