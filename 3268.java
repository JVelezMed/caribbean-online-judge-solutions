import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int longestSubsequence(char tgt, int start, String str){
		int count = 0, x;
		for(x=start;x<str.length();x++)
			if(str.charAt(x)==tgt)
				count++;
			else
				break;
		return count;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int maxRat=0, maxMilk=0, maxFish=0, x, tmp;
		char cur;
		for(x=0;x<line.length();x++){
			cur = line.charAt(x);
			tmp = longestSubsequence(cur, x, line);
			if(cur == 'R' && tmp > maxRat)
				maxRat = tmp;
			if(cur == 'M' && tmp > maxMilk)
				maxMilk = tmp;
			if(cur == 'F' && tmp > maxFish)
				maxFish = tmp;
			x += tmp - 1;
		}
		String winnerStr = null;
		int winnerNum = 0;
		if(maxRat >= maxMilk && maxRat >= maxFish){
			winnerStr = "Rat";
			winnerNum = maxRat;
		}
		if(maxMilk > maxRat && maxMilk >= maxFish){
			winnerStr = "Milk";
			winnerNum = maxMilk;
		}
		if(maxFish > maxRat && maxFish > maxMilk){
			winnerStr = "Fish";
			winnerNum = maxFish;
		}
		System.out.println(winnerNum + " " + winnerStr);
		br.close();
	}
}