import java.util.*;

public class ShapeTest{
	
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		int numofShapes = 0;
		int numOfPoints = 0;
		int numOfCircles = 0;
		int numOfCylinders = 0;
		double xval = 0;
		double yval = 0;
		double rval = 0;
		double hval = 0;

		try{

			System.out.println("How many shapes would you like to create?");
			numofShapes = input.nextInt();
			Shape[] shapes = new Shape[numofShapes];										//So if you enter 3, it can store 3 shapes of any type..e.g. 1 circle, 2 cylinders

			System.out.println("How many points would you like to create?");
			numOfPoints = input.nextInt();
			Point[] point = new Point[numOfPoints];											//A Point type 3 object references which can create eg 3 points - like point1,point2,point3

			System.out.println("How many circles would you like to create?");
			numOfCircles = input.nextInt();
			Circle[] circle = new Circle[numOfCircles];

			System.out.println("How many cylinders would you like to create?");		
			numOfCylinders = input.nextInt();
			Cylinder[] cylinder = new Cylinder[numOfCylinders];

			int totalShapes = (point.length + circle.length + cylinder.length);

			if(totalShapes == shapes.length){	//Check that they've not entered more/less shapes than they wanted, e.g. 3 shapes but 4 cylinders

				int arrayPosition = 0;

				for(int i = 0; i < point.length; i++){												//For each point in the point object array
					System.out.println("Enter your x co-ordinate for point number " + (i+1));
					xval = input.nextDouble();

					System.out.println("Enter your y co-ordinate for point number " + (i+1));
					yval = input.nextDouble();

					point[i] = new Point(xval, yval);												//For the first point, create an object with our values and so on..
					shapes[arrayPosition] = point[i];												//First shape contains the point
					arrayPosition++;																//Go to next shape to put in second point etc..
				}

				for(int i = 0; i < circle.length; i++){
					System.out.println("Enter your x co-ordinate for circle number " + (i+1));
					xval = input.nextDouble();

					System.out.println("Enter your y co-ordinate for circle number " + (i+1));
					yval = input.nextDouble();

					System.out.println("Enter your radius for circle number " + (i+1));
					rval = input.nextDouble();

					circle[i] = new Circle(xval, yval, rval);
					shapes[arrayPosition] = circle[i];
					arrayPosition++;
				}

				for(int i = 0; i < cylinder.length; i++){
					System.out.println("Enter your x co-ordinate for cylinder number " + (i+1));
					xval = input.nextDouble();

					System.out.println("Enter your y co-ordinate for cylinder number " + (i+1));
					yval = input.nextDouble();

					System.out.println("Enter your radius for cylinder number " + (i+1));
					rval = input.nextDouble();

					System.out.println("Enter your height for cylinder number " + (i+1));
					hval = input.nextDouble();

					cylinder[i] = new Cylinder(xval, yval, rval, hval);
					shapes[arrayPosition] = cylinder[i];
					arrayPosition++;
				}

				for(int i = 0; i < shapes.length; i++){
					System.out.println(shapes[i].getName() + ": " + shapes[i].toString());
					System.out.println("Area = " + shapes[i].getArea());
					System.out.println("Volume = " + shapes[i].getVolume());
					System.out.println();
				}

				//Cylinder cyl = (cylinder) shapes[2];
			}
			else{
				System.out.println("You are trying to make more/less shapes than you wanted to create!");
			}

		}

		catch(Exception e){
			System.err.printf("Exception: %s\n", e);
			System.err.printf("That is not possible");
		}
	}	
}
