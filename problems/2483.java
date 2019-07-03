
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a1, a2, b1, b2, c1, c2, d1, d2;
		
		StringTokenizer tokenizer = new StringTokenizer(in.readLine(), " ");
		a1 = Integer.parseInt(tokenizer.nextToken());
		a2 = Integer.parseInt(tokenizer.nextToken());
		
		tokenizer = new StringTokenizer(in.readLine(), " ");
		b1 = Integer.parseInt(tokenizer.nextToken());
		b2 = Integer.parseInt(tokenizer.nextToken());
		
		tokenizer = new StringTokenizer(in.readLine(), " ");
		c1 = Integer.parseInt(tokenizer.nextToken());
		c2 = Integer.parseInt(tokenizer.nextToken());
		
		if(a1 == b1)
			d1 = c1;
		else if(a1 == c1)
			d1 = b1;
		else
			d1 = a1;
		
		if(a2 == b2)
			d2 = c2;
		else if(a2 == c2)
			d2 = b2;
		else
			d2 = a2;
		
		System.out.printf("%d %d\n", d1, d2);
	}
}