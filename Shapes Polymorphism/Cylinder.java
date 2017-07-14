import java.util.*;

public class Cylinder extends Circle{

	private double h;
	
	public Cylinder(){
		super();			//Set all, x, y and r = 0
		h = 0;
	}

	public Cylinder(double x, double y, double r, double h){
		super(x,y,r);
		setHeight(h);
	}

	public double getHeight(){
		return h;
	}

	public void setHeight(double hval){
		h = hval < 0 ? 0 : hval;					//h = hval if hval is greater than 0
	}

	public double getArea(){
		return (2 * super.getArea()) + (2 * Math.PI * getRadius() * h);		//Cyclinder is made of 2 circles so call getArea of Circle class -> 2 * 2pi*r + 2pir*h
	}

	public double getVolume(){
		return (super.getArea() * h);
	}

	public String getName(){
		return "Cylinder";
	}

	public String toString(){
		return super.toString() + "; Height = " + h;
	}
}
