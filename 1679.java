import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;
		
		int players = Integer.parseInt(in.readLine());
		
		int PA, PJ, G, A, TA, TR;
		String bestPlayer = null;
		double bestFactor = 0;
		String currentPlayer;
		while(players-- > 0) {
			tok = new StringTokenizer(in.readLine());
			currentPlayer = tok.nextToken();
			PA = Integer.parseInt(tok.nextToken());
			PJ = Integer.parseInt(tok.nextToken());
			G = Integer.parseInt(tok.nextToken());
			A = Integer.parseInt(tok.nextToken());
			TA = Integer.parseInt(tok.nextToken());
			TR = Integer.parseInt(tok.nextToken());
			
			double factor = Math.log(PA) + PJ + 2*G + A - (TA + 2*TR);
			if(bestPlayer == null) {
				bestPlayer = currentPlayer;
				bestFactor = factor;
			}
			else {
				if(factor > bestFactor) {
					bestPlayer = currentPlayer;
					bestFactor = factor;
				}
			}
		}
		System.out.println(bestPlayer);
	}
}