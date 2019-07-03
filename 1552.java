import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static long ans[];
	public static long MOD = 1000000007;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int cases = Integer.parseInt(in.readLine());
		
		long n, m;
		long fn, fm;
		while(cases-- > 0) {
			ans = new long[2];
			tok = new StringTokenizer(in.readLine());

			n = Long.parseLong(tok.nextToken());
			m = Long.parseLong(tok.nextToken());
			
			fast_fib(n+1);
			fn = ans[0];
			fast_fib(m+2);
			fm = ans[0];
		
			System.out.println((fm - fn + MOD) % MOD);
		}

	}
	
	public static void fast_fib(long n)
	{
	    long a, b, c, d;
	
	    if(n == 0)
	    {
	        ans[0] = 0;
	        ans[1] = 1;
	        return;
	    }
	    
	    fast_fib((n/2));
	    a = ans[0];             /* F(n) */
	    b = ans[1];             /* F(n+1) */
	    c = 2*b - a;
	    if(c < 0)
	        c += MOD;
	    c = (a * c) % MOD;      /* F(2n) */
	    d = (a*a + b*b) % MOD;  /* F(2n + 1) */
	    if(n%2 == 0)
	    {
	        ans[0] = c;
	        ans[1] = d;
	    }
	    else
	    {
	        ans[0] = d;
	        ans[1] = c+d;
	    }
	}

}