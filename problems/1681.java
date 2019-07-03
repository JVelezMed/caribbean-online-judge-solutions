import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] input = reader.readLine().split(" ");
		double a = Double.parseDouble(input[0]), 
				b = Double.parseDouble(input[1]),
				c = Double.parseDouble(input[2]);
		System.out.println((b*b - 4*a*c >= 0) ? "YES" : "NO");
	}
}