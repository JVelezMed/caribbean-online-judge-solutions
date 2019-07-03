import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer;
		String input = reader.readLine();
		int a, b, c;
		
		while(!input.equals("0 0 0")) {
			tokenizer = new StringTokenizer(input);
			a = Integer.parseInt(tokenizer.nextToken());
			b = Integer.parseInt(tokenizer.nextToken());
			c = Integer.parseInt(tokenizer.nextToken());
			if(a > b)
				b = a + b - (a=b);
			if(b > c)
				c = b + c - (b=c);
			System.out.println((a*a + b*b == c*c) ? "right" : "wrong");
			input = reader.readLine();
		}
		
	}
}