import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok = new StringTokenizer(in.readLine());
		
		System.out.println(Long.parseLong(tok.nextToken()) * Long.parseLong(tok.nextToken()));
	}
}