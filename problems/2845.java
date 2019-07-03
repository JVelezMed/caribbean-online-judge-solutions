import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
	
	public static long precalc[] = new long[10];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		tok = new StringTokenizer(reader.readLine());
		double a, b;
		a = Double.parseDouble(tok.nextToken());
		b = Double.parseDouble(tok.nextToken());
		
		while(a != 0 || b != 0) {
			
			//Check the quadrant where it lies
			if(a > 0 && b > 0) {
				System.out.println("Q1");
			}
			else if(a < 0 && b > 0) {
				System.out.println("Q2");
			}
			else if(a < 0 && b < 0) {
				System.out.println("Q3");
			}
			else if(a > 0 && b < 0) {
				System.out.println("Q4");
			}
			else {
				System.out.println("AXIS");
			}
			
			tok = new StringTokenizer(reader.readLine());
			a = Double.parseDouble(tok.nextToken());
			b = Double.parseDouble(tok.nextToken());
		}
		
		System.out.println("AXIS");
		
			
		
	}
}