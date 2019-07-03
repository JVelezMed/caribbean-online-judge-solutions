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
		
		System.out.print("625");
		for (int i = 1; i < num; i++) {
			System.out.print("0");
		}
		System.out.println();
	}
}