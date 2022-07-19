package nizovi;

public class CitacJednocifrenihBrojeva {
    /*(Count single digits) Write a program that generates 200 random integers between
0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
    * */
    public static void main(String[] args) {


        int[] brojac = new int[10];

        //generisi 200 puta

        for (int i = 0; i < 200; i++) {
             brojac[(int) (Math.random() * 9)]++;
        }

        for (int i = 0; i < brojac.length; i++) {
            System.out.println(i + ": " + brojac[i]);
        }
    }
}

