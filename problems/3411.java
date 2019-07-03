import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	final static double PI = Math.acos(0) * 2.0;

	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int cases = Integer.parseInt(in.readLine());
		
		while(cases-- > 0) {
			double r = Double.parseDouble(in.readLine());
			
			System.out.printf("%.2f\n", r*r*(PI - 2));
		}
	}
}