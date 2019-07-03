import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int cases = Integer.parseInt(in.readLine());
		
		StringTokenizer tokenizer;
		String M, N;
		int index, indexT;
		
		for (int i = 0; i < cases; i++) {
			tokenizer = new StringTokenizer(in.readLine(), " ");
			M = tokenizer.nextToken();
			N = tokenizer.nextToken();
			
			index = M.indexOf(N);
			indexT = M.indexOf("T");
			if(index == -1 || indexT == -1) {
				System.out.println("N");
			}
			else
				System.out.println("Y");
		}
	}
}