import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.lang.Math;

public class loan {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    while ((line = in.readLine()) != null) {
      
      String[] numbersToAdd = line.split("~");
      double[] numbers = new double[numbersToAdd.length];
      for(int i = 0;i < numbersToAdd.length;i++) {
         numbers[i] = Integer.parseInt(numbersToAdd[i]);
      }
      double loan = numbers[0];
      double years = numbers[1];
      double interestRate = numbers[2] / 100;
      double downPayment = numbers[3];

      double monthlyInterestRate = interestRate / 12;

      double P = (monthlyInterestRate*loan) / (1 - Math.pow((1+monthlyInterestRate), -(years*12)));  
      System.out.println(Math.round(P));

      double currentValue = 6000 - downPayment;
      double interestPayed;
      double total = 0;
      for(int i = 0; i < 5; i++) {
        interestPayed = Math.round(currentValue * 0.06);
        currentValue = Math.round(currentValue - (P*12));
        total = Math.round(total + interestPayed);
        System.out.println(total);
      }
    }
  }
}
