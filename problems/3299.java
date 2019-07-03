import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		tok = new StringTokenizer(in.readLine());
		long a = Long.parseLong(tok.nextToken()) - 1;
		long b = Long.parseLong(tok.nextToken());
		
		while(a+b > 0) {
			long x = (long)(0.5*(Math.sqrt(8*a + 1) - 1));
			long y = (long)(0.5*(Math.sqrt(8*b + 1) - 1));
			
			System.out.println(y - x);
			
			tok = new StringTokenizer(in.readLine());
			a = Long.parseLong(tok.nextToken()) - 1;
			b = Long.parseLong(tok.nextToken());
		}
	}
}