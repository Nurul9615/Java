import java.util.*;

public class Circle extends Point{

	private double r;
	
	public Circle(){
		super();		//Call default constructor of Point to set x and y to 0
		r = 0;
	}

	public Circle(double x, double y, double r){
		super(x,y);			//Call constructor of Point - public Point(int xval, int yval){ x = xval; y = yval; }
		setRadius(r);
	}

	public double getRadius(){
		return r;
	}

	public void setRadius(double rval){
		r = rval < 0 ? 0 : rval;			//If radius is less than 0 then make r = 0 otherwise make it r = rval
	}

	public double getArea(){			//Do not need getVolume since its a circle - volume does not need to be implemented since Point is not an interface
		return (Math.PI * r * r);		//Pi r squared
	}

	public String getName(){
		return "Circle";
	}

	public String toString(){
		return "Center = " + super.toString() + "; Radius = " + r;	//Reuses toString of Point class, it is of the form C = [x,y]; R = r
	}

	//If method is refined in subclass, the same superclass method can be called using super.<superclassMethod> -> Eg above we use super.toString()
	//Private/static methods cannot be redefined - they are final
}
