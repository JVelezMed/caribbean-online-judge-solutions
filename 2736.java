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
		
		String number = in.readLine();
		System.out.println(number);
		
		int count = 0, transformations = 0;
		
		for (int i = 0; i < number.length(); i++) {
			count += number.charAt(i) - '0';
		}
		
		int temp;
		StringBuilder num;
		while(count > 1) {
			++transformations;
			temp = count;
			count = 0;
			num = new StringBuilder("");
			
			while(temp > 0) {
				num.append(temp & 1);
				count += temp & 1;
				temp >>= 1;
			}
			
			System.out.println(num.reverse());
		}
		
		
	}
	
}
