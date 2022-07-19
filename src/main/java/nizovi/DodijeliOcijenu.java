package nizovi;

public class DodijeliOcijenu {
    /*(Assign grades) Write a program that reads student scores, gets the best score, and
then assigns grades based on the following scheme:
Grade is A if score is Ú best -5
Grade is B if score is Ú best -10;
Grade is C if score is Ú best -15;
Grade is D if score is Ú best -20;
Grade is F otherwise.
The program prompts the user to enter the total number of students, and then
prompts the user to enter all of the scores, and concludes by displaying the grades.
Here is a sample run:
Enter the number of students: 4
Enter 4 scores: 40 55 70 58
Student 0 score is 40 and grade is F
Student 1 score is 55 and grade is C
Student 2 score is 70 and grade is A
Student 3 score is 58 and grade is C
    * */
    public static void main(String[] args) {
        int brojStudenata = 4;
        int[] bodovi = new int[brojStudenata];
        bodovi[0] = 40;
        bodovi[1] = 55;
        bodovi[2] = 70;
        bodovi[3] = 58;
        int najveciBod = dohvatiNajveciBrojBodova(bodovi);

        for (int i = 0; i < brojStudenata; i++) {
            System.out.println("Student " + i + " ima bodova: " + bodovi[i] + " i dobio je ocjenu: " + ispisiOcjenu((bodovi[i]), najveciBod));
        }

    }

    private static int dohvatiNajveciBrojBodova(int[] bodovi) {
        int maxBod = bodovi[0];
        for (int i = 0; i < bodovi.length; i++) {
            if (bodovi[i] > maxBod) {
                maxBod = bodovi[i];
            }
        }

        return maxBod;
    }

    private static char ispisiOcjenu(int brojBodova, int maxBod) {
        if (brojBodova >= maxBod-5) {
            return 'A';
        } else if (brojBodova >= maxBod-10) {
            return 'B';
        } else if (brojBodova >= maxBod-15) {
            return 'C';
        } else if (brojBodova >= maxBod-20) {
            return 'D';
        } else return 'F';

    }
}
