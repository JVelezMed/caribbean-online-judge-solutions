import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static char array[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;
		
		
		int cases = Integer.parseInt(in.readLine());
		
		while(cases-- > 0) {
			tok = new StringTokenizer(in.readLine());
			
			int K = Integer.parseInt(tok.nextToken());
			char S[] = tok.nextToken().toCharArray();
			
			int lBest = leftFlips(S, K);
			int rBest = rightFlips(S, K);
			
			System.out.println(lBest > rBest ? lBest : rBest);
			
		}
		
	}
	
	public static int leftFlips(char S[], int K) {
		
		int start, end;
		start = end = 0;
		int len = S.length;
		
		//Used first arrow flip
		if(S[start] == '>') {
			K--;
		}
		
		while(end < len) {
			//Can I open the window
			if(end+1 < len && S[end+1] == '<' && K >= 0) {
				end++;
			}
			//If not, do I have flips left
			else if (end+1 < len && S[end+1] == '>' && K > 0) {
				K--;	//used a flip
				end++;
			}
			else {
				if(S[start] == '>') {
					K++;	//move window but now have an arrow
				}
				if(end+1 < len && S[end+1] == '>') {
					K--;
				}
				
				start++;
				end++;
			}
		}	
		
		return end - start + 1;
	}
	
	public static int rightFlips(char S[], int K) {
		
		int start, end;
		start = end = 0;
		int len = S.length;
		
		//Used first arrow flip
		if(S[start] == '<') {
			K--;
		}
		
		while(end < len) {
			//Can I open the window
			if(end+1 < len && S[end+1] == '>' && K >= 0) {
				end++;
			}
			//If not, do I have flips left
			else if (end+1 < len && S[end+1] == '<' && K > 0) {
				K--;	//used a flip
				end++;
			}
			else {
				if(S[start] == '<') {
					K++;	//move window but now have an arrow
				}
				if(end+1 < len && S[end+1] == '<') {
					K--;
				}
				
				start++;
				end++;
			}
		}	
		
		return end - start + 1;
	}
	
}