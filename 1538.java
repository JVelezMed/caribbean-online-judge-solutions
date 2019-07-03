import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer tok;

		int cases = Integer.parseInt(in.readLine());
		double sum;
		
		for (int i = 1; i <= cases; i++) {
			sum = 0;
			for (int j = 1; j <= 12; j++) {
				sum += Double.parseDouble(in.readLine());
			}
			
			System.out.printf("%d $%,.2f\n", i, sum/12.0);
		}

	}

}