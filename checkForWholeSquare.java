// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;
import java.lang.Math;

class Solution {
    public int solution(int A, int B) {
        int firstNumber = A;
        int secondNumber = B;
        int range = (secondNumber - firstNumber) + 1;
        int[] listOfNumbers = new int[range];
        int numberOfWholeSquares = 0;
        
        for (int i = 0; i < range; i++) {
            listOfNumbers[i] = firstNumber;
            firstNumber++;
        }
        
        for (int i = 0; i < listOfNumbers.length; i++) {
            if ((listOfNumbers[i] % Math.sqrt(listOfNumbers[i])) == 0) {
                numberOfWholeSquares++;   
            }
        }    
        // for (int i = 0; i < listOfNumbers.length; i++) {
        //     System.out.println(listOfNumbers[i]);
        // }
    return numberOfWholeSquares;
    }
}