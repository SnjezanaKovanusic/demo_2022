package abstractClass.triangle;

import abstractClass.triangle.GeometricObject;

public class Triangle extends GeometricObject {
   /* (Triangle class) Design a new Triangle class that extends the abstract
    GeometricObject class. Draw the UML diagram for the classes Triangle and
    GeometricObject then implement the Triangle class. Write a test program
    that prompts the user to enter three sides of the triangle, a color, and a Boolean
    value to indicate whether the triangle is filled. The program should create a Triangle object with these sides, and set the color and filled properties using the
    input. The program should display the area, perimeter, color, and true or false to
    indicate whether it is filled or not.*/

    private double firstSideOfTriangle;
    private double secondSideOfTriangle;
    private double thirdSideOfTriangle;


    public Triangle(double firstSideOfTriangle, double secondSideOfTriangle, double thirdSideOfTriangle, String color, boolean isFilled) {
        super(color, isFilled);
        this.firstSideOfTriangle = firstSideOfTriangle;
        this.secondSideOfTriangle = secondSideOfTriangle;
        this.thirdSideOfTriangle = thirdSideOfTriangle;


    }

    public Triangle() {
    }

    public double getFirstSideOfTriangle() {
        return firstSideOfTriangle;
    }

    public void setFirstSideOfTriangle(double firstSideOfTriangle) {
        this.firstSideOfTriangle = firstSideOfTriangle;
    }

    public double getSecondSideOfTriangle() {
        return secondSideOfTriangle;
    }

    public void setSecondSideOfTriangle(double secondSideOfTriangle) {
        this.secondSideOfTriangle = secondSideOfTriangle;
    }

    public double getThirdSideOfTriangle() {
        return thirdSideOfTriangle;
    }

    public void setThirdSideOfTriangle(double thirdSideOfTriangle) {
        this.thirdSideOfTriangle = thirdSideOfTriangle;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "firstSideOfTriangle=" + firstSideOfTriangle +
                ", secondSideOfTriangle=" + secondSideOfTriangle +
                ", thirdSideOfTriangle=" + thirdSideOfTriangle +
                getColor()+
                '}';
    }

    @Override
    public double getArea() {
        double s = (firstSideOfTriangle + secondSideOfTriangle + thirdSideOfTriangle) / 2;
        return Math.sqrt(s * (s - firstSideOfTriangle) * (s - secondSideOfTriangle) * (s - thirdSideOfTriangle));
    }

    @Override
    public double getPerimeter() {
        return firstSideOfTriangle + secondSideOfTriangle + thirdSideOfTriangle;
    }
}
