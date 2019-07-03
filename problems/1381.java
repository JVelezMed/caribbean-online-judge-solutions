import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int cases = Integer.parseInt(in.readLine());
		double D, V1, V2, M;
		while(cases-- > 0) {
			tok = new StringTokenizer(in.readLine());
			
			D = Double.parseDouble(tok.nextToken());
			V1 = Double.parseDouble(tok.nextToken());
			V2 = Double.parseDouble(tok.nextToken());
			M = Double.parseDouble(tok.nextToken());
			
			System.out.printf("%.2f\n", M*D/(V1+V2));
		}
		
	}
}