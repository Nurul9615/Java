import java.util.*;

public class Point implements Shape{
	
	private double x;
	private double y;

	public Point(){
		this(0,0);	//Calls the constructor below with these parameters
	}

	public Point(double xval, double yval){
		x = xval;
		y = yval;
	}

	public double getX(){
		return x;
	}

	public double getY(){
		return y;
	}

	public void setX(double xval){
		x = xval;
	}

	public void setY(double yval){
		y = yval;
	}

	public String getName(){		//Override abstract method from Shape class
		return "Point";
	}

	public double getArea(){
		return 0;
	}

	public double getVolume(){
		return 0;
	}

	public String toString(){		//Returns a string of the form [x,y]
		return "[" + x + ", " + y + "]";
	}

}
