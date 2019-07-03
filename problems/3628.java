import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok, tok2;
		int count, matches;
		try {
			while(true) {
				count = matches = 0;
				tok = new StringTokenizer(in.readLine());
				tok2 = new StringTokenizer(in.readLine());
				
				
				while(tok.hasMoreTokens()) {
					++count;
					matches += (tok.nextToken().charAt(0) == tok2.nextToken().charAt(0)) ? 1 : 0;
				}
				
				System.out.println(count == matches ? "yes" : "no");
				
			}
		} catch (Exception e) {}
	}
}