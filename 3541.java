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

		while(cases-- > 0) {
			String input = in.readLine();

			for (int i = 0; i < input.length(); i++) {
				char letter = input.charAt(i);

				if(Character.isLetter(letter)) {
					if(Character.isLowerCase(letter)) {
						System.out.print(Character.toUpperCase(letter));
					}
					else {
						System.out.print(Character.toLowerCase(letter));
					}
				}
				else {
					System.out.print(letter);
				}
			}
			System.out.println();
		}
	}
}