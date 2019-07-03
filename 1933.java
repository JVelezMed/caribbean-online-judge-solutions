import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok = new StringTokenizer(reader.readLine(), " ");
		
		int a = Integer.parseInt(tok.nextToken());
		int b = Integer.parseInt(tok.nextToken());
		
		while(a > 0 && b > 0) {
			System.out.println(a + b);
			
			tok = new StringTokenizer(reader.readLine(), " ");
			a = Integer.parseInt(tok.nextToken());
			b = Integer.parseInt(tok.nextToken());
		}
		
		
		
	}

}
