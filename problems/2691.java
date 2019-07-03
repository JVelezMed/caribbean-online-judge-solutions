import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		tok = new StringTokenizer(in.readLine());
		int n, m;
		
		n = Integer.parseInt(tok.nextToken());
		m = Integer.parseInt(tok.nextToken());
		
		tok = new StringTokenizer(in.readLine());
		
		int sumN, sumM;
		sumN = sumM = 0;
		
		while(tok.hasMoreTokens()) {
			sumN += Integer.parseInt(tok.nextToken());
		}
		
		tok = new StringTokenizer(in.readLine());
		while(tok.hasMoreTokens()) {
			sumM += Integer.parseInt(tok.nextToken());
		}
		
		System.out.println(sumN > sumM ? "first win" : sumN < sumM ? "second win" : "tie");

	}

}
