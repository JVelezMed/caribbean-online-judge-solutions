import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int cases = Integer.parseInt(in.readLine());
		double a, b, c;
		
		while(cases-- > 0) {
			tok = new StringTokenizer(in.readLine());
			a = Double.parseDouble(tok.nextToken());
			b = Double.parseDouble(tok.nextToken());
			c = Double.parseDouble(tok.nextToken());
			
			double tq = ((b + c - a) * (a + b - c) * (c + a - b)) / (a * b * c);
			
			if(tq == 1.0) {
				System.out.println("equilateral");
			}
			else if(0.5 < tq && tq < 1.0) {
				System.out.println("good");
			}
			else if(0 < tq && tq <= 0.5) {
				System.out.println("bad");
			}
		}
	}
}