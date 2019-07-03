import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int cases = Integer.parseInt(in.readLine());

		while(cases-- > 0) {
			tok = new StringTokenizer(in.readLine());

			int a = Integer.parseInt(tok.nextToken());
			int b = Integer.parseInt(tok.nextToken());

			int gcd = gcd(a<b?a:b, a>b?a:b);
			
			System.out.println((a*b)/(gcd*gcd));
		}
	}

	public static int gcd(int p, int q) {
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		return p;
	}
}