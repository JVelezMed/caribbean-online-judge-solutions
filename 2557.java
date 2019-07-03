import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class uCalculateE {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(in.readLine());
		StringTokenizer tok;
		PriorityQueue<Integer> armyA, armyB;
		armyA = new PriorityQueue<Integer>(); 
		armyB =  new PriorityQueue<Integer>();
		
		//Get enemy army
		tok = new StringTokenizer(in.readLine());
		while(tok.hasMoreTokens()) {
			armyA.add(Integer.parseInt(tok.nextToken()));
		}
		
		//Get my army
		tok = new StringTokenizer(in.readLine());
		while(tok.hasMoreTokens()) {
			armyB.add(Integer.parseInt(tok.nextToken()));
		}
		//System.out.println("The armies");
		//System.out.println(armyA);
		//System.out.println(armyB);
		
		int num1 = -1, num2 = -1;
		
		int victories = 0;
		while(count-- >= 0) {
			if(num1 == -1) {
				//System.out.println("IN");
				num1 = armyA.remove();
				num2 = armyB.remove();
				//System.out.println("Initializing to: " + num1 + " " + num2);
			}
			//Lower or equal strength to enemy means no victory
			else if(num1 >= num2) {
				//System.out.println("Weak! " + num1 + " " + num2);
				if(!armyB.isEmpty()) {
					num2 = armyB.remove();
				}
			}
			//My soldier is stronger
			else if(num1 < num2) {
				//System.out.println("Victory! " + num1 + " " + num2);
				//victory!
				++victories;	
				if(!armyA.isEmpty()) {
					num1 = armyA.remove();
				}
				if(!armyB.isEmpty()) {
					num2 = armyB.remove();
				}
				//System.out.println(num1 + " " + num2);
			}	
		}
		System.out.println(victories);
	}
}