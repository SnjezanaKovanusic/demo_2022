package objekti.stopwach;

public class Stopwatch {
    /*(Stopwatch) Design a class named StopWatch. The class contains:
■■ Private data fields startTime and endTime with getter methods.
■■ A no-arg constructor that initializes startTime with the current time.
■■ A method named start() that resets the startTime to the current time.
■■ A method named stop() that sets the endTime to the current time.
■■ A method named getElapsedTime() that returns the elapsed time for the
stopwatch in milliseconds.
Draw the UML diagram for the class then implement the class. Write a test program
that measures the execution time of sorting 100,000 numbers using selection sort.
    * */
    private long startTime;
    private long endTime;

    Stopwatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        System.out.println("Počelo je sortiranje brojeva....");
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        System.out.println("Završilo je sortiranje brojeva....");
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        long l = getEndTime() - getStartTime();
        System.out.println("Vrjeme sortiranja: " + l + "[millis]");
        return l;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Stopwatch{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
