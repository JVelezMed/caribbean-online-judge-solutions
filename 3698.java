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
		int len = Integer.parseInt(tok.nextToken());
		String word = tok.nextToken();
		
		int lower, upper;
		lower = upper = 0;
		for (int i = 0; i < word.length(); i++) {
			lower += Character.isLowerCase(word.charAt(i)) ? 1 : 0;
			upper += Character.isUpperCase(word.charAt(i)) ? 1 : 0;
		}
		
		System.out.println(upper + " " + lower);
	}
}