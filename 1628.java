import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {


	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		for (int i = 1; i <= 1000; i++) {
			tok = new StringTokenizer(in.readLine());
			System.out.println(Integer.parseInt(tok.nextToken()) + Integer.parseInt(tok.nextToken()));
		}
	}

}
