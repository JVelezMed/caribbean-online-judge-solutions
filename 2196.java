import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String number;
		int cases = Integer.parseInt(reader.readLine());
		for (int i = 1; i <= cases; i++) {
			number = reader.readLine();
			System.out.println(((number.charAt(number.length() - 1) - '0') % 2 == 0) ? "even" : "odd");
		}
	}
}