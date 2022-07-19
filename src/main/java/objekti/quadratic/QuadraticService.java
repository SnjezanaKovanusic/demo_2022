package objekti.quadratic;

public class QuadraticService {
    /*A method named getDiscriminant() that returns the discriminant, which
is b2 - 4ac.
■■ The methods named getRoot1() and getRoot2() for returning two roots
of the equation
    * */
    public void ispisiDiscriminant(Quadratic quadratic) {

        double discriminant = getDiscriminant(quadratic);
        if (discriminant > 0) {
            System.out.println("The equation has two roots" + "Root 1: " + getRoot1(quadratic) + "Root 2: " + getRoot2(quadratic));
        } else if (discriminant == 0) {
            System.out.println("The equation has one root " + getRoot1(quadratic));
        } else System.out.println("The equation has no roots! ");
    }

    private double getDiscriminant(Quadratic quadratic) {
        double result = (quadratic.getB() * 2) - (4 * quadratic.getA() * quadratic.getC());
        return result;
    }

    private double getRoot1(Quadratic quadratic) {
        double r1 = 0;
        double up = (Math.negateExact((int) quadratic.getB())) + Math.sqrt(Math.pow(quadratic.getB(), 2) - (4 * quadratic.getA() * quadratic.getC()));
        double down = 2 * quadratic.getA();
        r1 = up / down;
        return r1;
    }

    private double getRoot2(Quadratic quadratic) {
        double r2 = 0;
        double up = (Math.negateExact((int) quadratic.getB())) - Math.sqrt(Math.pow(quadratic.getB(), 2) - (4 * quadratic.getA() * quadratic.getC()));
        double down = 2 * quadratic.getA();
        r2 = up / down;
        return r2;
    }


}
