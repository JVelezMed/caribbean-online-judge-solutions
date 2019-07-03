import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());
		String str;
		int total, length;
		
		for (int i = 0; i < cases; i++) {
			str = in.readLine();
			total = 0;
			
			length = str.length();
			for(int j = 1; j <= length; ++j) {
				if(j % 2 == 1) {
					total = (total + (str.charAt(length-j)-'0')) % 4;
				}
				else {
					total = (total + 3*(str.charAt(length-j)-'0')) % 4;
				}
			}
			
			System.out.println((total % 4 == 0) ? "YES" : "NO");		
		}
	}
}