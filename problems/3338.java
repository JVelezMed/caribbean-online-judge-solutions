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
		
		for (int i = 1; i <= cases; i++) {
			String message = in.readLine();
			String encoded = in.readLine();
			
			char map[] = new char[26];
			for (int j = 0; j < encoded.length(); j++) {
				map[j] = encoded.charAt(j);
			}
			
			System.out.print(i + " ");
			for (int j = 0; j < message.length(); j++) {
				char letter = message.charAt(j);
				System.out.print(letter == ' ' ? ' ' : map[letter - 'A']);
			}
			System.out.println();
			
			
		}
	}

}