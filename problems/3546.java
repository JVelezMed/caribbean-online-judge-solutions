import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int cases = Integer.parseInt(in.readLine());

		int idx = 0;
		double ratio = 1000000.0;
		for (int i = 0; i < cases; i++) {
			tok = new StringTokenizer(in.readLine());

			double tempRatio = Double.parseDouble(tok.nextToken()) / Double.parseDouble(tok.nextToken());
			if(tempRatio < ratio) {
				idx = i;
				ratio = tempRatio;
			}
		}

		System.out.println(idx+1);
	}
}