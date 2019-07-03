import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer tok;

		Scanner in = new Scanner(System.in);
		
		PriorityQueue<Integer> nums = new PriorityQueue<Integer>();
		for (int i = 1; i <= 6; i++) {
			nums.add(in.nextInt());
		}
		
		int a, b, c, d, e, f;
		a = nums.remove();
		d = nums.remove();
		b = nums.remove();
		e = nums.remove();
		c = nums.remove();
		f = nums.remove();
		
		System.out.println((a==d && b==e && c==f && a*a + b*b == c*c) ? "YES" : "NO");
	}

}