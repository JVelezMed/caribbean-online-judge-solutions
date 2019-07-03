import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Character> charCount;
		
		int cases = Integer.parseInt(in.readLine());
		
		while(cases-- > 0) {
			charCount = new HashSet<Character>();
			
			String word = in.readLine();
			int length = word.length();
			for (int i = 0; i < length; i++) {
				charCount.add(word.charAt(i));
			}
			System.out.println(charCount.size());
		}
	}
}