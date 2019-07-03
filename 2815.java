import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int cases = Integer.parseInt(in.readLine());
		String word, subWord;
		int reductions;
		while(cases-- > 0) {
			tok = new StringTokenizer(in.readLine());
			word = tok.nextToken();
			subWord = tok.nextToken();
			
			reductions = 0;
			while(word.contains(subWord)) {
				int idx = word.indexOf(subWord);
				word = word.substring(0, idx) + word.substring(idx+subWord.length());
				++reductions;
			}
			
			System.out.println(reductions);
		}

	}

}