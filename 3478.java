import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;
		
		String num = in.readLine();
				
		switch(num.length() % 3) {
			case 0:
				break;
			case 1:
				num = "00" + num;
				break;
			case 2:
				num = "0" + num;
				break;
		}
		
		int len = num.length();
		for (int i = 0; i < len; i += 3) {
			System.out.print(4*(num.charAt(i)-'0') + 
					2*(num.charAt(i+1)-'0') + 
					1*(num.charAt(i+2)-'0'));
		}
		System.out.println();
	}
}