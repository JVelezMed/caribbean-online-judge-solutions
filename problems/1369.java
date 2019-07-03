import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		double L, N, K;
		
		tok = new StringTokenizer(in.readLine());
		
		L = Double.parseDouble(tok.nextToken());
		N = Double.parseDouble(tok.nextToken());
		K = Double.parseDouble(tok.nextToken());
		
		while(L != 0 || N != 0 || K != 0) {
			double px, py, p2x, p2y;
			px = (L/N)*K;
			py = 0;
			p2x = 0.5*(L/N)*(N-K);
			p2y = Math.sqrt(3)*(0.5*(L/N)*(N-K));
			
			double distance = Math.sqrt((p2x-px)*(p2x-px) + (p2y-py)*(p2y-py));
			double s = 1.5*distance;
			
			System.out.println((int)(0.5 + Math.sqrt(s*(s-distance)*(s-distance)*(s-distance))));
			
			tok = new StringTokenizer(in.readLine());
			
			L = Double.parseDouble(tok.nextToken());
			N = Double.parseDouble(tok.nextToken());
			K = Double.parseDouble(tok.nextToken());
		}

	}

}