import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uCalculateE {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());
		String input;
		char lastCharacter;
		for (int i = 1; i <= cases; i++) {
			input = in.readLine();
			lastCharacter = input.charAt(input.length() - 1);
			System.out.println((lastCharacter == '0' || lastCharacter == '5') ? "YES" : "NO");
		}
	}
}