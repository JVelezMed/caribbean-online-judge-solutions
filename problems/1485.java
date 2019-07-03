import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String word = reader.readLine();
		
		char letters[] = new char[word.length()];
		
		for (int i = 0; i < letters.length; i++) {
			letters[i] = word.charAt(i);
		}
		
		Arrays.sort(letters);
		
		for (int i = 0; i < letters.length; i++) {
			System.out.print(letters[i]);
		}
		System.out.println();
	}

}
