package com.example.quartz;

public abstract class Shape {
    // Fields for x and y coordinates
    private int x;
    private int y;
    protected String color = "red";
    
    // Constructor to initialize x and y
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x
    public int getX() {
        return x;
    }

    // Setter for x
    public void setX(int x) {
        this.x = x;
    }

    // Getter for y
    public int getY() {
        return y;
    }

    // Setter for y
    public void setY(int y) {
        this.y = y;
    }
}
