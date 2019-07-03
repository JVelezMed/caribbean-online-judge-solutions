import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;
		
		int cases = Integer.parseInt(reader.readLine());
		long balance;
		int transactions;
		
		for (int i = 0; i < cases; i++) {
			balance = Long.parseLong(reader.readLine());
			transactions = Integer.parseInt(reader.readLine());
			for (int j = 0; j < transactions; j++) {
				tok = new StringTokenizer(reader.readLine(), " ");
				balance += tok.nextToken().equals("C") ? 
								Long.parseLong(tok.nextToken()) : 
								-Long.parseLong(tok.nextToken());
			}
			
			System.out.println(balance);

		}
		
		
		
	}

}
