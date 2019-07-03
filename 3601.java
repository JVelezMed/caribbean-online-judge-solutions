import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	
	public static boolean isPrime[];
	public static int gaps[];
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;
		
		String numbers[] = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve"};
		
		int cases = Integer.parseInt(in.readLine());
		
		while(cases-- > 0) {
			System.out.println(numbers[Integer.parseInt(in.readLine())]);
		}
		
		
	}
	
}
