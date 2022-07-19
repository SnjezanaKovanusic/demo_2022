package abstractClass.triangle;

public class AbstractMain {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 2, 3, "white", true);
        GeometricObject triangle2 = new Triangle(1, 5, 6, "blue", true);

        double area= triangle.getArea();
        System.out.println(area);
        System.out.println(triangle);
    }
}
