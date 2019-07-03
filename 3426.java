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
		
		long a, b;
		a = Long.parseLong(tok.nextToken());
		b = Long.parseLong(tok.nextToken());
		
		long min = a < b ? a : b;
		long max = a > b ? a : b;
		
		long x = max - min + 1;
		long y = min + max -1;
				
		System.out.println(y*(y+1)/2 - x*(x-1)/2);
	}
}