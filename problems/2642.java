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
		
		String num;
		int total;
		while(cases-- > 0) {
			total = 0;
			num = in.readLine();
			int len = num.length();
			
			for (int i = 0; i < len; i++) {
				if(i % 2 == 0) {
					total = (total + 1*(num.charAt(len-i-1) - '0')) % 3;
				}
				else {
					total = (total + 2*(num.charAt(len-i-1) - '0')) % 3;
				}
			}
			System.out.println(total == 0 ? "YES" : "NO");
		}
	}
}