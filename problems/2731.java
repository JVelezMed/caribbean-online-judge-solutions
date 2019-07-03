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
		
		int cases = Integer.parseInt(reader.readLine());
		double number;
		
		while(cases-- > 0) {
			
			number = Double.parseDouble(reader.readLine());
			
			//Area between = Area square - area circle
			System.out.printf("%.2f\n", number*number - (Math.PI*number*number/4.0));
			
		}
		
	}
}
