package objekti.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMain {
    /*(Addition quiz) Rewrite Listing 5.1, RepeatAdditionQuiz.java, to alert the user
if an answer is entered again. (Hint: use an array list to store answers.) Here is a
sample run
    * */
    public static void main(String[] args) {

        runQuiz();
    }

    public static void runQuiz() {
        System.out.println("Welcome to quiz!  ");

        int sum = getSumOfTwoRandomNumbers();

        ArrayList<Object> listOfAnswers = new ArrayList<>();

        System.out.println("Take an answer: ");

        int answer = answer();

        play(answer, sum, listOfAnswers);


    }

    private static void play(int answer, int sum, ArrayList<Object> listOfAnswers) {
        while (answer != sum) {

            listOfAnswers.add(answer);
            System.out.println("Take an answer: ");
            answer = answer();
            checkDoesAnswerIsRepeat(listOfAnswers, answer);
        }
        System.out.println("You won!!");
    }


    private static void checkDoesAnswerIsRepeat(List listOfAnswers, int answer) {
        if (listOfAnswers.contains(answer)) {
            System.out.println("You alrady have that num: " + answer);
        }
    }

    private static int getSumOfTwoRandomNumbers() {
        int num1 = getResult();
        int num2 = getResult();
        System.out.println("What is " + num1 + "+" + num2);
        return num1 + num2;
    }

    private static int answer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int getResult() {
        return (int) (Math.random() * 10);
    }
}
