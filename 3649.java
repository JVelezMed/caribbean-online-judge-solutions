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

		tok = new StringTokenizer(in.readLine());
		int N = Integer.parseInt(tok.nextToken());
		int K = Integer.parseInt(tok.nextToken());
		
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(in.readLine());
		}
		
		Arrays.sort(arr);
		
		int start, end;
		start = end = 0;
		
		//Sliding window
		while(end < N) {
			//Expand
			if(end < N-1 && arr[end+1]-arr[start] <= K) {
				end++;
			}
			//Slide
			else {
				start++;
				end++;
			}
		}
		
		System.out.println(end - start + 1);
		
	}

}