import java.util.*;

public interface Shape{	//It is an interface since all its methods do not have implementations, so everything is abstract 
	
	public String getName();		//This is reused by the other subclasses to acquire the name of each shape

	public double getArea();

	public double getVolume();

	//All methods MUST be implemented in the class it will be implemented by

}
