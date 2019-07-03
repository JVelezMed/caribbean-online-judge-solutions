import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;
		
		int cases = Integer.parseInt(in.readLine());
		
		while(cases-- > 0) {
			tok = new StringTokenizer(in.readLine());
			
			int factor = Integer.parseInt(tok.nextToken());
			int distance = Integer.parseInt(tok.nextToken());
			
			System.out.println(distance - (distance/factor));
		}
	}
}