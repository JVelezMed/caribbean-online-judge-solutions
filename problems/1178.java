import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

import javax.swing.text.Position;


public class Main {
	
	public static long precalc[] = new long[10];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int cases = Integer.parseInt(reader.readLine());
		int itemsToBuy;
		PriorityQueue<Integer> prices;
		
		while(cases-- > 0) {
			itemsToBuy = Integer.parseInt(reader.readLine());
			prices = new PriorityQueue<Integer>();
			
			tok = new StringTokenizer(reader.readLine());
			
			while(tok.hasMoreTokens()) {
				//Negative because I want the maximum
				prices.add(-Integer.parseInt(tok.nextToken()));
			}
			
			int step = 1;
			int accum = 0;
			while(prices.size() > 0) {
				//Add every three items
				if(step % 3 == 0) {
					accum += -prices.remove();
				}
				else {
					prices.remove();
				}
				
				step++;
			}
			
			System.out.println(accum);
				
		}
	}
}