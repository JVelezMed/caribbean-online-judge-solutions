import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int num = Integer.parseInt(in.readLine());
		
		while(num != 0) {
			System.out.println(num < 3 ? 0 : 12*(num-2));
			num = Integer.parseInt(in.readLine());
		}
	}
}