import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int cases = Integer.parseInt(in.readLine());
		
		long a, b;
		while(cases-- > 0) {
			tok = new StringTokenizer(in.readLine());

			a = Long.parseLong(tok.nextToken());
			b = Long.parseLong(tok.nextToken());

			System.out.println(powMod(a, b, 1000000000));
		}

	}

	public static long powMod(long base, long exp, long modulus) {
		base %= modulus;
		long result = 1;
		while (exp > 0) {
			if (exp % 2 == 1) {
				result = (result * base) % modulus;
			}
			base = (base * base) % modulus;
			exp >>= 1;
		}
		return result;
	}

}