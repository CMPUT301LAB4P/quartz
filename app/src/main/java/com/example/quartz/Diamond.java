package quartz.app.src.main.java;

public class Diamond extends Shape{

    private double sideLength; //initialize a double for side length of shape



    public Diamond(int x, int y, double sideLength){
        super(x,y); // parent class constructor 
        this.sideLength = sideLength;
        
    }
    

    public double getSideLength(){ //getter sidelength
        return sideLength;
    }

    public void setSideLength(double sideLength){//setter sidelength
        this.sideLength = sideLength;
    }

}