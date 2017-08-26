import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        StringOrdList strings = new StringOrdList(); //Object called strings
        IntegerOrdList integers = new IntegerOrdList();
        Boolean exitProgram = true;						//Keep main program running

        while(exitProgram == true)
        {
            try
            {
                System.out.println(" ");
                System.out.println("1) Use Integer List");
                System.out.println("2) Use String List");
                System.out.println("3) Exit");
                System.out.println(" ");
                int firstMenuAnswer = input.nextInt();

                switch(firstMenuAnswer)
                {
                    case 1:
                        boolean exit = true;
                        while(exit == true)
                        {
                            try
                            {
                                System.out.println(" ");
                                System.out.println("1) Add integers");
                                System.out.println("2) Remove an integer");
                                System.out.println("3) Print integer list");
                                System.out.println("4) Exit");
                                System.out.println(" ");

                                int firstInnerMenuAnswer = input.nextInt();

                                //Add number
                                if(firstInnerMenuAnswer == 1)
                                {
                                    System.out.println("What number would you like to add?");
                                    while(!input.hasNextInt())
                                    {				//If it is a string entered
                                        input.next();
                                        System.out.println("Enter a number instead");	//Print this if they enter a string
                                    }
                                    System.out.println(" ");
                                    integers.insert(input.nextInt());
                                }
                                //Delete number
                                else if (firstInnerMenuAnswer == 2)
                                {
                                    System.out.println(" ");
                                    System.out.println("What number would you like to delete?");
                                    while(!input.hasNextInt()){
                                        input.next();
                                        System.out.println("Enter a number instead");
                                    }
                                    integers.remove(input.nextInt());
                                }
                                //Print List
                                else if (firstInnerMenuAnswer == 3)
                                {
                                    System.out.println(" ");
                                    System.out.println(integers.toString());
                                    System.out.println(" ");
                                }
                                //Exit integer list
                                else if (firstInnerMenuAnswer == 4)
                                    exit = false;
                                else
                                    System.out.println("That is not possible. Choose between 1, 2, 3 or 4.");
                            }
                            catch(Exception e)
                            {
                                System.out.println("Must choose option 1 to 4");
                                input.next();
                            }
                        }
                        break;

                    case 2:
                        exit = true;
                        while(exit)
                        {
                            System.out.println(" ");
                            System.out.println("1) Add strings");
                            System.out.println("2) Remove a string");
                            System.out.println("3) Print string list");
                            System.out.println("4) Exit");
                            System.out.println(" ");

                            int secondInnerMenuAnswer = input.nextInt();

                            //Add strings
                            if(secondInnerMenuAnswer == 1)
                            {
                                System.out.println(" ");
                                System.out.println("Enter the string to add:");
                                String stringToAdd = input.nextLine();
                                if(stringToAdd.matches("\\d+"))
                                {		//Check if it is an integer entered
                                    System.out.println("You cannot enter integers");
                                    break;
                                }
                                System.out.println(" ");
                                strings.insert(stringToAdd);
                            }
                            //Remove strings
                            else if (secondInnerMenuAnswer == 2)
                            {
                                System.out.println(" ");
                                System.out.println("Which String would you like to delete");
                                String stringToDelete = input.nextLine();
                                System.out.println(" ");
                                if(stringToDelete.matches("\\d+"))
                                {
                                    System.out.println("You cannot enter integers");
                                    break;
                                }
                                strings.remove(stringToDelete);
                            }
                            //Print strings
                            else if (secondInnerMenuAnswer == 3)
                            {
                                System.out.println(" ");
                                System.out.println(strings.toString());
                                System.out.println(" ");
                            }
                            else if (secondInnerMenuAnswer == 4)
                                exit = false;
                            else
                                System.out.println("That is not possible. Choose between 1, 2, 3 or 4.");
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
            catch(Exception e)
            {
                System.out.println("Enter a number between 1 to 3");
                input.next();
            }
        }
    }
}
