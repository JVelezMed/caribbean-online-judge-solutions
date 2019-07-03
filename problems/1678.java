
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());
		
		StringTokenizer tokenizer;
		int total, lowestPerimeter = -1;
		int a, b, c;
		for (int i = 1; i <= cases; i++) {
			tokenizer = new StringTokenizer(in.readLine(), " ");
			
			a = Integer.parseInt(tokenizer.nextToken());
			b = Integer.parseInt(tokenizer.nextToken());
			c = Integer.parseInt(tokenizer.nextToken());
			
			if(a+b > c && a+c > b && b+c > a) {
				total = a+b+c;
				if(lowestPerimeter == -1)
					lowestPerimeter = total;
				else if(total < lowestPerimeter)
					lowestPerimeter = total;
			}
		}
		System.out.println(lowestPerimeter);
	}
}