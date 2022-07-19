package objekti.fan;

public class Fan {
    /*(The Fan class) Design a class named Fan to represent a fan. The class contains:
■■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3
to denote the fan speed. --> konstante tj vidi sa enumima
■■ A private int data field named speed that specifies the speed of the fan (the
default is SLOW).
■■ A private boolean data field named on that specifies whether the fan is on (the
default is false).
■■ A private double data field named radius that specifies the radius of the fan
(the default is 5).
■■ A string data field named color that specifies the color of the fan (the default
is blue).
■■ The accessor and mutator methods for all four data fields.
■■ A no-arg constructor that creates a default fan.
■■
    * */

    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "Blue";
    }

    public void setSpeed(int x) {
        this.speed=x;
    }
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public void turnOff() {
        on = false;
    }

    public void turnOn() {
        on = true;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return on ? toStringForFanIsOn() : toStringForFanIsOff();
    }

    private String toStringForFanIsOff() {
        return "Fan{" + "fan is off" +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    private String toStringForFanIsOn() {
        return "Fan{" +
                "speed:" + speed +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

}



/* If
the fan is on, the method returns the fan speed, color, and radius in one combined string. If the fan is not on, the method returns the fan color and radius
along with the string “fan is off” in one combined string.
* */
