import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int d = Integer.parseInt(in.readLine());
		tok = new StringTokenizer(in.readLine());
		
		int arr[] = new int[d];
		for (int i = 0; i < d; i++) {
			arr[i] = Integer.parseInt(tok.nextToken());
		}
		
		double max = 0;
		for (int i = 0; i < d - 1; i++) {
			for (int j = i+1; j < d; j++) {
				max = Math.max(max, arr[j] - arr[i]);
			}
		}
		
		System.out.println((int)max);	
	}
}