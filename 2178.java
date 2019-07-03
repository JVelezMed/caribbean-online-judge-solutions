import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class uCalculateE {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		//int cases = Integer.parseInt(in.readLine());
		PriorityQueue<Integer> odds = new PriorityQueue<Integer>();

		in.readLine();

		int sum = 0;
		StringTokenizer tok = new StringTokenizer(in.readLine());

		//Read the numbers
		while(tok.hasMoreTokens()) {
			int number = Integer.parseInt(tok.nextToken());

			//Add the evens, count the odds
			if(number % 2 == 0) {
				sum += number;
			}
			else {
				odds.add(number);
			}
		}

		int size = odds.size();
		if(size == 0) {
			System.out.println(-1);
		}
		else if(size%2 == 0){
			odds.remove();
			while(!odds.isEmpty()) {
				sum += odds.remove();
			}
			System.out.println(sum);
		}
		else {
			while(!odds.isEmpty()) {
				sum += odds.remove();
			}
			System.out.println(sum);
		}
	}
}