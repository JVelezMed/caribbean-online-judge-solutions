import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int cases = Integer.parseInt(in.readLine());
		
		for (int i = 1; i <= cases; i++) {
			tok = new StringTokenizer(in.readLine());
			double x = Double.parseDouble(tok.nextToken());
			double y = Double.parseDouble(tok.nextToken());
			
			double dist = x*x + y*y;
			
			System.out.printf("Property %d: This property will begin eroding in year %d.\n",
					i,
					(int)Math.floor(1 + .0314*dist));
		}
		System.out.println("END OF OUTPUT.");
	}
}
