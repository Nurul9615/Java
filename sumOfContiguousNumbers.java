import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.lang.Math;

public class Hey {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    while ((line = in.readLine()) != null) {
      
      String[] numbersToAdd = line.split(",");
      int[] numbers = new int[numbersToAdd.length];
      for(int i = 0;i < numbersToAdd.length;i++) {
         numbers[i] = Integer.parseInt(numbersToAdd[i]);
      }
      
      int max_so_far;
      int max_ending_here = max_so_far = numbers[0];
      for(int i = 1; i<numbers.length; i++){
        max_ending_here = Math.max(i, max_ending_here + i);
        max_so_far = Math.max(max_so_far, max_ending_here);
      }
      System.out.println(max_so_far);  
    }
  }
}
