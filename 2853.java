import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;
		
		int num = Integer.parseInt(in.readLine());
		
		while(num != 0) {
			double ans = (2.0*num*num)/(1 + Math.sqrt(2));
			System.out.printf("%.3f\n", ans);
			num = Integer.parseInt(in.readLine());
		}
		
		
	}
	
}
