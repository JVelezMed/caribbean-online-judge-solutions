import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	
	public static long precalc[] = new long[10];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		tok = new StringTokenizer(reader.readLine());
		
		int a = Integer.parseInt(tok.nextToken());
		int b = Integer.parseInt(tok.nextToken());
		int steps = 0;
		
		while(a%2 != 0 && b%2 != 0) {
			steps++;
			a >>= 1;
			b >>= 1;
		}
		
		long multiplier = 1;
		for (int i = 1; i <= steps; i++) {
			multiplier *= 4;
		}
		
		System.out.println((multiplier - 1) / 3);
		
		
		
	}
}