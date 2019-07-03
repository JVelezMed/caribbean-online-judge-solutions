import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		tok = new StringTokenizer(in.readLine());
		
		int items, take;
		items = Integer.parseInt(tok.nextToken());
		take = Integer.parseInt(tok.nextToken());
		
		PriorityQueue<Integer> prices = new PriorityQueue<Integer>();
		tok = new StringTokenizer(in.readLine());
		
		while(tok.hasMoreTokens()) {
			prices.add(Integer.parseInt(tok.nextToken()));
		}
		
		int total = 0;
		for (int i = 0; i < take && prices.peek() <= 0; i++) {
			total += -prices.remove();
		}
		
		System.out.println(total);
		
	}
}