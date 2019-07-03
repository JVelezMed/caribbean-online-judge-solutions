import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uCalculateE {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());

		int b, r, o, k, e, n;

		//The word to be read
		String word;
		//The cases
		for (int i = 0; i < cases; i++) {
			b = r = o = k = e = n = 0;

			word = in.readLine();
			//The length of the word
			int length = word.length();
			
			//Go through the while word
			for (int j = 0; j < length; j++) {
				switch (word.charAt(j)) {
				case 'B':
					++b;
					break;
				case 'R':
					++r;
					break;
				case 'O':
					++o;
					break;
				case 'K':
					++k;
					break;
				case 'E':
					++e;
					break;
				case 'N':
					++n;
					break;
				default:
					
					break;
				}
			}
			
			if(b == r && r == o && o == k && k == e && e == n)
				System.out.println("No Secure");
			else
				System.out.println("Secure");
		}
	}
}