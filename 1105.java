import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(reader.readLine());
		int term, numerator, denominator, cycle, sum;
		for (int i = 1; i <= cases; i++) {
			term = Integer.parseInt(reader.readLine());
			cycle = (int) Math.ceil( (-1 + Math.sqrt(1 + 8*term) ) / 2 );
			sum = cycle*(cycle+1)/2;
			//System.out.println(cycle + " " + sum);
			
			if(cycle % 2 == 0) {
				numerator = cycle;
				denominator = 1;
				System.out.println("TERM " + term + " IS " + 
								   (numerator - (sum - term)) + "/" +
								   (denominator + (sum - term)));
			}
			else{
				numerator = 1;
				denominator = cycle;
				System.out.println("TERM " + term + " IS " + 
						   (numerator + (sum - term)) + "/" +
						   (denominator - (sum - term)));
			}
		}
	}
}