//2605 - Beautiful Yekaterinburg
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class uCalculateE {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;
		
		PriorityQueue<Integer> goalDifferences = new PriorityQueue<Integer>();
		
		tok = new StringTokenizer(in.readLine());
		int matches = Integer.parseInt(tok.nextToken());
		int goalsToBuy = Integer.parseInt(tok.nextToken());
		
		int score = 0;
		while(matches-- > 0) {
			tok = new StringTokenizer(in.readLine());
			int team = Integer.parseInt(tok.nextToken());
			int opponent = Integer.parseInt(tok.nextToken());
			
			if(team > opponent) {
				score += 3;
			}
			else if(team == opponent) {
				if(goalsToBuy > 0) {
					//team wins by one
					score += 3;
					goalsToBuy--;
				}
				else {
					score += 1;
				}
			}
			else {
				goalDifferences.add(opponent - team);
			}
		}
		
		while(goalsToBuy > 0 && !goalDifferences.isEmpty()) {
			int difference = goalDifferences.remove();
			if(difference > goalsToBuy) {
				goalsToBuy = 0;
			}
			else if(difference == goalsToBuy){
				score += 1;
				goalsToBuy = 0;
			}
			else {
				score += 3;
				goalsToBuy -= (difference + 1);
			}
		}
		
		System.out.println(score);
	}
}