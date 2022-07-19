package objekti.fan;


public class FanMain {
    /*Draw the UML diagram for the class then implement the class. Write a test program
that creates two Fan objects. Assign maximum speed, radius 10, color yellow,
and turn it on to the first object. Assign medium speed, radius 5, color blue, and
turn it off to the second object. Display the objects by invoking their toString
method
    * */
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.turnOn();
        fan.setSpeed(fan.FAST);
        fan.setRadius(10);
        fan.setColor("Yellow");


        System.out.println("Fan 0: " + fan);

        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.MEDIUM);
        fan1.setColor("Blue");
        fan1.setRadius(5);
        System.out.println("Fan 1: " + fan1);

    }
}
