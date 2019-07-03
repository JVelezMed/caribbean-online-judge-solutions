import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;
		
		int cases = Integer.parseInt(reader.readLine());
		String s1, s2;
		int mismatches, length;
		
		while(cases-- > 0) {
			tok = new StringTokenizer(reader.readLine());
			s1 = tok.nextToken();
			s2 = tok.nextToken();

			length = s1.length();
			mismatches = 0;
			for (int i = 0; i < length; i++) {
				if(s1.charAt(i) != s2.charAt(i)) {
					++mismatches;
				}
			}
			
			System.out.println(mismatches);
		}
		
	}

}
