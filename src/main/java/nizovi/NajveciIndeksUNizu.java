package nizovi;

public class NajveciIndeksUNizu {
    /*(Find the index of the largest element) Write a method that returns the index of the
largest element in an array of integers. If there is more than one element, return
the largest index. Use the following header:
public static int indexOfLargestElement(double[] array)
 Write a test program that prompts the user to enter 10 numbers, invokes this
method to return the index of the largest element, and displays the index and the
element itself
    * */
    public static void main(String[] args) {

        double niz []= {5.2,7.3,3.4};

        int najveciBrojUNizu = indeksNajvecegBrojauNIzu(niz);
        System.out.println("Najveci broj u nizu se nalazi na indeksu: "+najveciBrojUNizu);
    }

    private static int indeksNajvecegBrojauNIzu(double[] niz) {
        double najveciBroj = niz[0];
        int najveciIndeks = 0;
        for (int i = 0; i<niz.length; i++){
            if (niz[i]>najveciBroj){
                najveciBroj=niz[i];
                najveciIndeks=i;
            }
        }
        return najveciIndeks;
    }
}
