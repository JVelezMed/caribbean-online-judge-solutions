import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;
		HashSet<Character> letters;
		
		String word = reader.readLine();
		
		while(!word.equals("*")) {
			tok = new StringTokenizer(word, " ");
			letters = new HashSet<Character>();
			while(tok.hasMoreTokens()) {
				letters.add(tok.nextToken().substring(0,1).toLowerCase().charAt(0));
			}
			
			System.out.println(letters.size() == 1 ? "Y" : "N");
			word = reader.readLine();
		}
		
		
		
	}

}
