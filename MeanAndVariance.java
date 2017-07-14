import java.util.*; 

public class MeanAndVariance{

	public static double calculateMean(double[] arguments){

		double sum = 0;

		for(int p = 0; p < arguments.length; p++){		//For the amount of numbers entered used
			sum = sum + arguments[p]; 					//Keep adding each number to the previous sum
		}

		double average = sum / arguments.length;

	return average;
	}
	
	public static double calculateVariance(double[] args){

		int length = args.length;
		double variance = 0;
		double varianceSum = 0;

		for (double s: args){												//Enhanced for loop to count to the amount of numbers entered
			variance += (s - calculateMean(args)) * (s - calculateMean(args));	//New variance is calculated for each number entered using standard formulae
		} 
			
		varianceSum = variance / length;

	return varianceSum;
	}

	public static double[] getArguments(int nargs, Scanner inputStream){

		inputStream = new Scanner(System.in);	//inputStream is the reference to the Scanner object 
		
		double[] arguments = new double[nargs];

		System.out.println("Enter the " + nargs + " numbers now");

		for(int i = 0; i < arguments.length; i++){
			arguments[i] = inputStream.nextDouble();
		}	
	
	return arguments;	
	}

	public static void main(String args[]){

		Scanner input = new Scanner(System.in);

		try{

		System.out.println("How many numbers would you like to use?");

		int numbersUsed = input.nextInt();

		if(numbersUsed >= 2){

			double[] result = getArguments(numbersUsed,input);		//Store the arguments they enter in an array

				System.out.println("Numbers entered are:");
				for(int k = 0; k < result.length; k++){
					System.out.print(result[k] + "\n");
				}

			System.out.println("Mean value of numbers is: " + calculateMean(result));
			System.out.println("Variance of numbers is: " + calculateVariance(result));
		}

		else{
			System.out.println("You must enter two or more numbers");
		}

		/*System.out.println("Would you like to calculate the mean [1] or the variance [2]? ");

		int answer = input.nextInt();

		switch(answer){

			case(1):

				System.out.println("Numbers entered are:");
				for(int k = 0; k < result.length; k++){
					System.out.print(result[k] + "\n");
				}

				System.out.println("Mean value of numbers is: " + calculateMean(result));

				break;

			case(2):

				System.out.println("Numbers entered are:");
				for(int k = 0; k < result.length; k++){
					System.out.print(result[k] + "\n");
				}

				System.out.println("Variance of numbers is: " + calculateVariance(result));

				break;

			default:

				System.out.println("That is not possible");

		}
		*/

		}
		catch(Exception e){
			System.err.printf("Exception: %s\n", e);
			System.err.printf("That is not possible");
		}
	}
}