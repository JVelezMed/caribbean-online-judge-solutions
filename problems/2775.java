import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	
	public static long precalc[] = new long[10];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int words = Integer.parseInt(in.readLine());
		
		String word;
		while(words-- > 0) {
			word = in.readLine();
			
			char letter = word.charAt(0);
			if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
				System.out.println(word + "cow");
			}
			else {
				System.out.println(word.substring(1) + letter + "ow");
			}
			
		}
	}
}