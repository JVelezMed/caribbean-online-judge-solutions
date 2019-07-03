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
		
		for (int i = 1; i <= cases; i++) {
			int num = Integer.parseInt(in.readLine());
			
			System.out.printf("Case #%d: %d\n", i
					, (int)(Math.log10(num)/Math.log10(2.0)));
		}
	}
}