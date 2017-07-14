import java.util.*;

public class OrderedListTest{

	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		StringOrdList strings = new StringOrdList();
		IntegerOrdList integers = new IntegerOrdList();
		Boolean exitProgram = true;						//Keep main program running 

		while(exitProgram == true){

			try{

				System.out.println(" ");
				System.out.println("1) Use Integer List");
				System.out.println("2) Use String List");
				System.out.println("3) Exit");
				System.out.println(" ");
				int answer = input.nextInt();

				switch(answer){

					case 1:

					boolean exit = true;

					while(exit == true){

						try{

							System.out.println(" ");
							System.out.println("1) Add integers");
							System.out.println("2) Remove an integer");
							System.out.println("3) Print integer list");
							System.out.println("4) Exit");
							System.out.println(" ");

							int answer2 = input.nextInt();

							if(answer2 == 1){														//add number
								int numberToAdd = 0;
								System.out.println("What number would you like to add?");
								while(!input.hasNextInt()){				//If it is a string entered
									input.next();
									System.out.println("Enter a number instead");	//Print this if they enter a string
								}
								numberToAdd = input.nextInt();
								System.out.println(" ");
								integers.insert(numberToAdd);
							}

							else if (answer2 == 2){													//Delete number
								int numberToDelete = 0;
								System.out.println(" ");
								System.out.println("What number would you like to delete?");
								while(!input.hasNextInt()){
									input.next();
									System.out.println("Enter a number instead");
								}
								numberToDelete = input.nextInt();
								integers.remove(numberToDelete);
							}

							else if (answer2 == 3){													//Print List
								System.out.println(" ");
								System.out.println(integers.toString());
								System.out.println(" ");
							}

							else if (answer2 == 4){													//Exit integer list
								exit = false;
							}

							else{
								System.out.println("That is not possible. Choose between 1, 2, 3 or 4.");
							}
						}
						catch(Exception e){
							System.out.println("Must choose option 1 to 4");
							input.next();
						}
					}

					break;

					case 2:

					exit = true;
					String stringToAdd;
					Scanner scan = new Scanner(System.in);

					while(exit == true){

						System.out.println(" ");
						System.out.println("1) Add strings");
						System.out.println("2) Remove a string");
						System.out.println("3) Print string list");
						System.out.println("4) Exit");
						System.out.println(" ");

						int answer3 = input.nextInt();

						if(answer3 == 1){																					//Add strings

							System.out.println(" ");
							System.out.println("Enter the string to add:");
							stringToAdd = scan.nextLine();
							if(stringToAdd.matches("\\d+")){		//Check if it is an integer entered
								System.out.println("You cannot enter integers");
								break;
							}
							System.out.println(" ");
							strings.insert(stringToAdd);
						}

						else if (answer3 == 2){																				//Remove strings

							System.out.println(" ");
							String stringToDelete;
							System.out.println("Which String would you like to delete");
							stringToDelete = scan.nextLine();
							System.out.println(" ");
							if(stringToDelete.matches("\\d+")){
								System.out.println("You cannot enter integers");
								break;
							}
							strings.remove(stringToDelete);
						}

						else if (answer3 == 3){																				//Print strings
							System.out.println(" ");
							System.out.println(strings.toString());
							System.out.println(" ");
						}

						else if (answer3 == 4){
							exit = false;
						}

						else{
							System.out.println("That is not possible. Choose between 1, 2, 3 or 4.");
						}
					}

					break;	

					case 3:

					System.exit(1);

					break;

					default:

					System.out.println("Choose between options 1 to 3");

					break;
				}
			
			}
			catch(Exception e){
				System.out.println("Enter a number between 1 to 3");
				input.next();
			}
		}
	}
}
