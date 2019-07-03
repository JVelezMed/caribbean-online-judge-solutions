import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	final static double PI = Math.acos(0) * 2.0;

	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int cases = Integer.parseInt(in.readLine());
		
		int years[] = new int[cases];
		int percent[] = new int[cases];
		
		for (int i = 0; i < cases; i++) {
			tok = new StringTokenizer(in.readLine());
			
			years[i] = Integer.parseInt(tok.nextToken());
			percent[i] = Integer.parseInt(tok.nextToken());
		}
		
		int idx = 0;
		int min = 999999;
		for (int i = 0; i < cases - 2; i++) {
			if(percent[i] + percent[i+1] + percent[i+2] <= min) {
				idx = i;
				min = percent[i] + percent[i+1] + percent[i+2];
			}
		}
		System.out.println(years[idx] + " " + years[idx+1] + " " + years[idx+2]);
	}
}