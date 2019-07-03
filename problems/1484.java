import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(reader.readLine());
		double highest = -999999;
		int idx = 0;
		
		for (int i = 1; i <= size; i++) {
			double number = Double.parseDouble(reader.readLine());
			
			if(number >= highest) {
				highest = number;
				idx = i;
			}
		}
		
		System.out.println(idx);
		
		
	}

}
