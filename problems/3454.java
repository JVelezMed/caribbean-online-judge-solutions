import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int cases = Integer.parseInt(in.readLine());
		
		while(cases-- > 0) {
			String seq = in.readLine();
			int len = seq.length();
			int degree = 0;
			
			for (int i = 0; i < len - 2; i++) {
				for (int j = i+1; j < len - 1; j++) {
					for (int k = j+1; k < len; k++) {
						if(seq.charAt(i) == 'C' && seq.charAt(j) == 'A' && seq.charAt(k) == 'T') {
							degree++;
						}
					}
				}
			}
			
			System.out.println(degree);
		}
	}
}