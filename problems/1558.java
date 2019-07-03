import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

import javax.swing.text.Position;


public class Main {
	
	public static long precalc[] = new long[1000003];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;
		
		precalc[0] = 0;
		precalc[1] = 1;
		
		for (int i = 2; i <= 1000002; i++) {
			precalc[i] = (precalc[i-1] + precalc[i-2]) % 1000000007;
		}

		int cases = Integer.parseInt(reader.readLine());
		
		while(cases-- > 0) {
			System.out.println(precalc[Integer.parseInt(reader.readLine()) + 2]);		
		}
		
	}
}