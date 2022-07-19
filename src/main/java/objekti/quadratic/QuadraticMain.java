package objekti.quadratic;
/*Write a test program that prompts the user to enter values for a, b, and c and displays the result
based on the discriminant. If the discriminant is positive, display the two roots. If
the discriminant is 0, display the one root. Otherwise, display “The equation has
no roots.”
       * */
public class QuadraticMain {
    public static void main(String[] args) {
        QuadraticService quadraticService = new QuadraticService();
        Quadratic quadratic = new Quadratic(1.0, 3, 1);

        quadraticService.ispisiDiscriminant(quadratic);
    }
}
