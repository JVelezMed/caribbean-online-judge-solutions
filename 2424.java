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

		for (int i = 1; i <= cases; i++) {
			int K = Integer.parseInt(in.readLine());
			int max = 0;
			
			tok = new StringTokenizer(in.readLine());
			while(tok.hasMoreTokens()) {
				int num = Integer.parseInt(tok.nextToken());
				
				max = num > max ? num : max;
			}
			
			System.out.printf("Case %d: %d %d\n", i, K+1, max+1);
			
		}


	}

}