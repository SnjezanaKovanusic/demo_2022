package objekti.rectangle;

public class RectangleService {

    public double getArea(Rectangle rectangle) {
        return rectangle.getHeight() * rectangle.getWidth();
    }

    public double getPerimetar(Rectangle rectangle) {
        return 2 * (rectangle.getWidth() + rectangle.getHeight());
    }


}
