import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
		
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int a, b, c;
		tok = new StringTokenizer(in.readLine());
		
		a = Integer.parseInt(tok.nextToken());
		b = Integer.parseInt(tok.nextToken());
		c = Integer.parseInt(tok.nextToken());
		
		while(a!= 0 || b!=0 || c!=0) {
			int gcd = a > b ? gcd(a,b) : gcd(b,a);
			
			System.out.println(c%gcd == 0 ? "YES" : "NO");
			
			tok = new StringTokenizer(in.readLine());
			a = Integer.parseInt(tok.nextToken());
			b = Integer.parseInt(tok.nextToken());
			c = Integer.parseInt(tok.nextToken());
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