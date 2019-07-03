import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
	
	public static boolean isPrime[];
	public static int gaps[];
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;
		
		HashSet<Integer> fillers = new HashSet<Integer>();
		
		int episodes = Integer.parseInt(in.readLine());
		tok = new StringTokenizer(in.readLine());
		tok.nextToken();
		while(tok.hasMoreTokens()) {
			fillers.add(Integer.parseInt(tok.nextToken()));
		}
		
		System.out.println(episodes - fillers.size());
		
		
	}
	
}
