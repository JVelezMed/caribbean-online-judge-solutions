
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());
		StringTokenizer tokenizer;
		int a, b, c;
		for (int i = 1; i <= cases; i++) {
			tokenizer = new StringTokenizer(in.readLine(), " ");
			a = Integer.parseInt(tokenizer.nextToken());
			b = Integer.parseInt(tokenizer.nextToken());
			c = Integer.parseInt(tokenizer.nextToken());
			System.out.println((b*b - 4*a*c) >= 0 ? "SI" : "NO");
		}
	}
}