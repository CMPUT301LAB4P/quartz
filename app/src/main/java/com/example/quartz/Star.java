package quartz.app.src.main.java;

public class Star extends Shape {
        // Field for the side length of the square
    private double sideLength;

    // Constructor to initialize x, y, and sideLength
    public Star(int x, int y, double sideLength) {
        super(x, y); // Calling the parent class constructor
        this.sideLength = sideLength;
    }

    // Getter for the side length
    public double getSideLength() {
        return sideLength;
    }

    // Setter for the side length
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;

    }
}