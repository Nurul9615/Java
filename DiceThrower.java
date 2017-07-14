import java.util.*;

public class DiceThrower{
	
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		Random randGen = new Random();				//Object from Random class to create random integers
		//int x = 0;
		boolean g = true;

		try{		

			while(g){

			System.out.println("How many sides should the virtual dice have?");

			int amountOfSides = input.nextInt();

			int sidesCounter[] = new int[amountOfSides];		//An array the size of the number of sides, to contain each side number quantity thrown so if 6 sides, then an array of 6 numbers

			for(int t = 0; t < amountOfSides; t++){
				sidesCounter[t] = 0;							//Initalise each side to 0 in the array of sides
			}

			if (amountOfSides >= 2){						//Check if the sides they've entered is greater than two

				System.out.println("How many times should the dice be thrown?");
				int diceThrown = input.nextInt();

				if(diceThrown % amountOfSides == 0 || diceThrown == 1){		//If there is no remainder with the number of times thrown being a multiple of the sides

					for(int i = 0; i < diceThrown; i++){					//Throw the dice i amount of times

						int rollValue = randGen.nextInt(amountOfSides);		//Create a random integer each time with a value between 0 - amount of sides so if 6 sides then create a value ranging from 1,2,3,4,5,6
						
						for(int f = 0; f < amountOfSides; f++){				//Count up to the number of sides entered, for example 6 times
								if(rollValue == f){							//If the random number created (eg 1,2,3,4,5) is equal to one of the sides
									sidesCounter[f] = sidesCounter[f] + 1;	//Incremement the index corresponding to the side by 1	
								}
						}
					}	
					for(int k = 0; k < amountOfSides; k++){
						System.out.println("The number of " + (k+1) + "'s: " + sidesCounter[k]);
						g = false;
					}
					break;	
				}
				else{
					System.out.println("This should be a multiple of the number of sides");
				}
				continue;
			}
			else{
				System.out.println("The number of sides must be greater than or equal to two");
			}
			continue;
			}
		}
		catch(Exception e){								//Catch a general exception e - dont know what it actually is
			System.err.printf("Exception: %s\n", e);
			System.err.printf("That is not possible");
		}
	}
}
