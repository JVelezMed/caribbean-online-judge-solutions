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
			long n = Long.parseLong(in.readLine());
			
			System.out.println(n + ((n*n*n*n - 6*n*n*n + 23*n*n - 42*n + 24) / 24));	
		}
	}
}