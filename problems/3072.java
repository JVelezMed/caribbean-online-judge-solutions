import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
		
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int number = Integer.parseInt(in.readLine());
		
		System.out.println(number==2 ? "NO" : number%2==0 ? "YES" : "NO");

	}
	
}