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

		BigInteger num = new BigInteger("2");
		String ans[]= new String[41];
		
		ans[2] = num.toString();
		for (int i = 3; i <= 40; i++) {
			num = num.multiply(new BigInteger(String.valueOf(i)));
			ans[i] = num.toString();
		}
		
		int cases = Integer.parseInt(in.readLine());
		
		while(cases-- > 0) {
			System.out.println(ans[Integer.parseInt(in.readLine())]);
		}
		
	}

}