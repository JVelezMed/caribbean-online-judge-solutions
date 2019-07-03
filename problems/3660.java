import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int cases = Integer.parseInt(in.readLine());
		
		int arr[] = new int[cases];
		
		for (int i = 0; i < cases; i++) {
			arr[i] = Integer.parseInt(in.readLine());
		}
		
		Arrays.sort(arr);
		int max = Integer.MAX_VALUE;
		
		for (int i = 0; i < cases/2; i++) {
			max = arr[i] + arr[arr.length - i - 1] < max ? arr[i] + arr[arr.length - i - 1] : max; 
		}
		
		System.out.println(max);
	}

}