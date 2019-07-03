import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		long precalc[] = new long[1000001];
		for (int i = 1; i <= 1000000; i++) {
			if(i % 2 == 0) {
				precalc[i] = precalc[i-1];
			}
			else {
				precalc[i] = (precalc[i-1] + (long)i*(long)i)%1000000007;
			}
		}
		
		try {
			while(true) {
				int num = Integer.parseInt(in.readLine());
				
				System.out.println(precalc[num]);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}