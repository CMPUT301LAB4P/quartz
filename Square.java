public class Square extends Shape {
    // Field for the side length of the square
    private double sideLength;

    // Constructor to initialize x, y, and sideLength
    public Square(int x, int y, double sideLength) {
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

    // Implementation of the abstract getArea method
    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    // Implementation of the abstract getPerimeter method
    @Override
    public double getPerimeter() {
        return 4 * sideLength;
    }
}