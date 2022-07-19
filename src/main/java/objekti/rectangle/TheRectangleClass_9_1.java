package objekti.rectangle;

import objekti.rectangle.Rectangle;

public class TheRectangleClass_9_1 {
    /*
    design a class named Rectangle to represent a rectangle. The class contains:
    ■■ Two double data fields named width and height that specify the width and
    height of the rectangle. The default values are 1 for both width and height.
    ■■ A no-arg constructor that creates a default rectangle.
    ■■ A constructor that creates a rectangle with the specified width and height.
    ■■ A method named getArea() that returns the area of this rectangle.
    ■■ A method named getPerimeter() that returns the perimeter.
    Draw the UML diagram for the class then implement the class. Write a test program that creates two Rectangle objects—one with width 4 and height 40, and
    three objectives
    M09_LIAN1878_11_GE_C09.indd 384 12/29/17 4:11 PM
    Programming Exercises 385
    the other with width 3.5 and height 35.9. Display the width, height, area, and
    perimeter of each rectangle in this order.
         */
    public static void main(String[] args) {
        RectangleService rectangleService = new RectangleService();

        Rectangle ractangle = new Rectangle(4, 40);
        Rectangle ractangle2 = new Rectangle(3.5, 35.9);

        System.out.println("height: " + ractangle.getHeight() + "area: " + rectangleService.getArea(ractangle) + "\n" + "widith " + ractangle.getWidth() + " perimetar: " + rectangleService.getPerimetar(ractangle));
        System.out.println("area: " + rectangleService.getArea(ractangle2) + " perimetar: " + rectangleService.getPerimetar(ractangle2));

    }

}

