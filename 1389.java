import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = reader.readLine();
		
		String maxPalindrome = "";
		String maxPalindrome2 = "";
		
		int start, end, nStart, nEnd;
		for (int i = 0; i < input.length(); i++) {
			start = end = nStart = nEnd = i;
			
			while(start >= 0 && end < input.length() && input.charAt(start) == input.charAt(end)) {
				if(start >= 0 && end < input.length()) {
					nStart = start;
					nEnd = end;
				}
				start--;
				end++;
			}
			
			String tempMaxPalindrome = input.substring(nStart, nEnd+1);
			if(tempMaxPalindrome.length() > maxPalindrome.length()) {
				maxPalindrome = tempMaxPalindrome;
			}
		}
		
		for (int i = 0; i < input.length()-1; i++) {
			start = nStart = i;
			end = nEnd = i+1;
			
			while(start >= 0 && end < input.length() && input.charAt(start) == input.charAt(end)) {
				if(start >= 0 && end < input.length()) {
					nStart = start;
					nEnd = end;
				}
				start--;
				end++;
			}
			
			String tempMaxPalindrome = input.substring(nStart, nEnd+1);
			if(tempMaxPalindrome.length() > maxPalindrome2.length()) {
				maxPalindrome2 = tempMaxPalindrome;
			}
		}
		
		System.out.println(maxPalindrome.length() > maxPalindrome2.length() ? maxPalindrome : maxPalindrome2);
		
	}

}