import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	
	//public static long precalc[] = new long[10];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		//buildPrecalc();
		
		long precalc[] = new long[1000001];
		precalc[0] = 1;
		long temp, accum = 1;
		for (int i = 1; i <= 1000000; i++) {
			temp = i;
			accum = 1;
			while(temp > 0) {
				accum = accum * (temp % 10);
				temp /= 10;
			}
			precalc[i] = precalc[i-1] + (accum % 2 == 0 ? 1 : 0);
		}
		
		int cases = Integer.parseInt(reader.readLine());
		
		int a, b;
		while(cases-- > 0) {
			tok = new StringTokenizer(reader.readLine());
			
			a = Integer.parseInt(tok.nextToken());
			b = Integer.parseInt(tok.nextToken());
			
			System.out.println(precalc[b] - precalc[a-1]);
			
			
		}
	}
}
