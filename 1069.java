import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(reader.readLine());
		int a, b, n;
		String[] numbers;
		for (int i = 1; i <= cases; i++) {
			numbers = reader.readLine().split(" ");
			a = Integer.parseInt(numbers[0]);
			b = Integer.parseInt(numbers[1]);
			n = Integer.parseInt(numbers[2]);
			System.out.println((n == 1) ? 0 : (a+b-1)/(n-1));
		}
	}
}