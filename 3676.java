import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int cases = Integer.parseInt(in.readLine());
		
		for (int i = 1; i <= cases; i++) {
			BigDecimal num = new BigDecimal(in.readLine());
			
			BigDecimal result = num.divide(new BigDecimal(5));
			
			System.out.printf("Case %d: %s\n", i, result.toString().replace('.', ','));
		}
	}
}