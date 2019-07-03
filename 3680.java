import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int cases = Integer.parseInt(in.readLine());

		while(cases-- > 0) {
			tok = new StringTokenizer(in.readLine());

			int M = Integer.parseInt(tok.nextToken());
			int W = Integer.parseInt(tok.nextToken());

			tok = new StringTokenizer(in.readLine());
			
			long arr[] = new long[M];
			for (int i = 0; i < M; i++) {
				arr[i] = Long.parseLong(tok.nextToken());
			}
			
			Arrays.sort(arr);
			
			for (int i = 1; i < M; i++) {
				arr[i] += arr[i-1];
			}
			
			int count = 0;
			int x = 0;
			while(x < M && arr[x] <= W) {
				x++;
				count++;
			}
			
			System.out.println(count);
		}
	}
}