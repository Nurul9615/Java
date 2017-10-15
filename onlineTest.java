import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class onlineTest {
 
    public static void main(String[] args) throws IOException {

  	    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
  	    BufferedReader in = new BufferedReader(reader);
  	    
  	    String line;
		while ((line = in.readLine()) != null) {
			String[] numbers = line.split(",");
			int[] numbersList = new int[numbers.length];

			for(int i = 0; i < numbers.length; i++) {
				numbersList[i] = Integer.parseInt(numbers[i]);
			}
    	}
  	}
}
