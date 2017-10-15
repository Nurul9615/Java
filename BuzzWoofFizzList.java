import java.util.*;
import java.lang.Math;

class Solution {
    public void solution(int N) {
        int firstNumber = 1;
        int lastNumber = N;
        int[] listOfNumbers = new int[N];
        
        for (int i = 0; i < N; i++) {
            listOfNumbers[i] = firstNumber;
            firstNumber++;
        }
        // System.out.println(listOfNumbers[0]);
        // System.out.println(listOfNumbers[23]);
        
        for(int i = 0; i < listOfNumbers.length; i++) {
            if((listOfNumbers[i] % 3) == 0) {
                if (((listOfNumbers[i] % 3) == 0) && ((listOfNumbers[i] % 5) == 0))
                    System.out.println("FizzBuzz");
                else if (((listOfNumbers[i] % 3) == 0) && ((listOfNumbers[i] % 7) == 0))    
                    System.out.println("FizzWoof");
                else
                    System.out.println("Fizz");
            }
            else if ((listOfNumbers[i] % 5) == 0) {
                if (((listOfNumbers[i] % 5) == 0) && ((listOfNumbers[i] % 7) == 0))    
                    System.out.println("BuzzWoof");
                else
                    System.out.println("Buzz");
            }
            else if ((listOfNumbers[i] % 7) == 0) {
                System.out.println("Woof");
            }
            else if (((listOfNumbers[i] % 3) == 0) && ((listOfNumbers[i] % 5) == 0) && ((listOfNumbers[i] % 7) == 0))
                System.out.println("FizzBuzzWoof");
            else {
                System.out.println(i+1);
            }
        }
    }
}