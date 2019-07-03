import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//Read the initial three values
		StringTokenizer tok = new StringTokenizer(in.readLine());
		int typeOneToys = Integer.parseInt(tok.nextToken());
		int typeTwoToys = Integer.parseInt(tok.nextToken());
		int maxDistance = Integer.parseInt(tok.nextToken());

		
		//Type one toys
		tok = new StringTokenizer(in.readLine());
		PriorityQueue<Integer> toy1Distance = new PriorityQueue<Integer>();
		while(tok.hasMoreTokens()) {
			toy1Distance.add(Integer.parseInt(tok.nextToken()));
		}		
		
		//Type two toys
		tok = new StringTokenizer(in.readLine());
		PriorityQueue<Integer> toy2Distance = new PriorityQueue<Integer>();
		while(tok.hasMoreTokens()) {
			toy2Distance.add(Integer.parseInt(tok.nextToken()));
		}
		
		int pairs = 0;
		
		//Make pairs while both queues have elements
		while(!toy1Distance.isEmpty() && !toy2Distance.isEmpty()) {
			int num1 = toy1Distance.peek();
			int num2 = toy2Distance.peek();
			
			if(Math.abs(num1 - num2) <= maxDistance) {
				pairs++;
				toy1Distance.remove();
				toy2Distance.remove();
			}
			else if(num1 < num2) {
				toy1Distance.remove();
			}
			else {
				toy2Distance.remove();
			}
		}
		System.out.println(pairs);
	}
}