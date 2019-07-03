import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;
		
		int cases = Integer.parseInt(in.readLine());
		
		while(cases-- > 0) {
			tok = new StringTokenizer(in.readLine());
			String num = tok.nextToken();
			
			StringBuilder middle = new StringBuilder();
			
			middle.append(new StringBuilder(tok.nextToken()).reverse());
			
			while(tok.hasMoreTokens()) {
				middle.append(new StringBuilder(tok.nextToken() + "*").reverse());
			}
			
			System.out.printf("%s%s%s\n", num.substring(0,2), middle.reverse(), num.substring(2,4));
		}
	}
}