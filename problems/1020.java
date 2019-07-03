import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;
		
		boolean first = true;
		int n, k;
		int players[][];
		int p1, p2;
		String m1, m2;
		
		String input = reader.readLine();
		
		while(!input.equals("0")) {
			tok = new StringTokenizer(input);
			n = Integer.parseInt(tok.nextToken());
			k = Integer.parseInt(tok.nextToken());
			players = new int[n+1][2];	//keep score for players
			
			for(int i = 0; i < k*n*(n-1)/2; ++i) {
				tok = new StringTokenizer(reader.readLine());
				p1 = Integer.parseInt(tok.nextToken());
				m1 = tok.nextToken();
				
				p2 = Integer.parseInt(tok.nextToken());
				m2 = tok.nextToken();
				
				//Player 1 wins
				if((m1.equals("rock") && m2.equals("scissors")) ||
					(m1.equals("paper") && m2.equals("rock")) ||
					(m1.equals("scissors") && m2.equals("paper"))) {
					players[p1][0]++;
					players[p2][1]++;
				}
				//Player 2 wins
				else if ((m2.equals("rock") && m1.equals("scissors")) ||
						(m2.equals("paper") && m1.equals("rock")) ||
						(m2.equals("scissors") && m1.equals("paper"))) {
					players[p2][0]++;
					players[p1][1]++;
				}
							
			}
			
			//Check if first input
			if(first) {
				first = false;
			}
			else {
				System.out.println();
			}
			
			for (int i = 1; i <= n; i++) {
				if(players[i][0]+players[i][1] == 0){
					System.out.println("-");
				}
				else {
					System.out.printf("%.3f\n", 1.0*players[i][0]/(players[i][0]+players[i][1]));
				}
			}
			
			input = reader.readLine();
		}
		
	}

}
