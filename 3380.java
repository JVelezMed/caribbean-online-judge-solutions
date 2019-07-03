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
		
		while(cases-- > 0) {
			tok = new StringTokenizer(in.readLine());
			
			String S, P;
			S = tok.nextToken();
			P = tok.nextToken();
			
			if(S.length() == P.length()) {
				int matches = 0;
				for (int i = 0; i < S.length(); i++) {
					if(S.charAt(i) == P.charAt(i) || S.charAt(i) == P.charAt(S.length() - i - 1)) {
						matches++;
					}
				}
				
				System.out.println(matches == S.length() ? "YES" : "NO");
			}
			else {
				System.out.println("NO");
			}
			
		}
	}
}