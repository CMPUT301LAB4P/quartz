package com.example.quartz;

public class Parallelogram extends Shape{
    private int sideLength;

    public Parallelogram(int x, int y, int sideLength){
        super(x,y);
        this.sideLength = sideLength
    }

    public int getSideLength(){ return sideLength; }
    public void setSideLength(int sideLength){ this.sideLength = sideLength; }
}
