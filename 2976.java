import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		String input = in.readLine();
		
		while(!input.equals("0")) {
			tok = new StringTokenizer(input);
			
			int size = Integer.parseInt(tok.nextToken());
			int arr[] = new int[size];
			
			int lAcc = 0, rAcc = 0;
			for (int i = 0; i < size; i++) {
				arr[i] = Integer.parseInt(tok.nextToken());
				rAcc += arr[i];
			}
			
			int i = size - 1;
			while(i >= 0 && lAcc < rAcc) {
				lAcc += arr[i];
				rAcc -= arr[i];
				i--;
			}
			
			if(lAcc == rAcc) {
				System.out.printf("Sam stops at position %d and Ella stops at position %d.\n", i+1, i+2);
			}
			else {
				System.out.println("No equal partitioning.");
			}
			
			input = in.readLine();
		}
	}

}