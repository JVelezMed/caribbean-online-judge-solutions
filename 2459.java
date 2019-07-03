//2147 - Displacing Characters
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class uCalculateE {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//int cases = Integer.parseInt(in.readLine());
		StringTokenizer tokenizer;

		HashMap<String, ArrayList<Integer>> wordList;

		String input;
		try {
			while(!(input = in.readLine()).isEmpty()) {
				//Initialize word list
				wordList = new HashMap<String, ArrayList<Integer>>();
				String temp;
				int scoreCard[] = {0, 0, 0};
				
				//Player 1
				tokenizer = new StringTokenizer(input);
				while(tokenizer.hasMoreTokens()) {
					temp = tokenizer.nextToken();
					//Word not added
					if(wordList.get(temp) == null) {
						wordList.put(temp, new ArrayList<Integer>());
						wordList.get(temp).add(0);
					}
					else {
						wordList.get(temp).add(0);
					}
				}
				//System.out.println(wordList);
				
				//Player 2
				tokenizer = new StringTokenizer(in.readLine());
				while(tokenizer.hasMoreTokens()) {
					temp = tokenizer.nextToken();
					//Word not added
					if(wordList.get(temp) == null) {
						wordList.put(temp, new ArrayList<Integer>());
						wordList.get(temp).add(1);
					}
					else {
						wordList.get(temp).add(1);
					}
				}
				//System.out.println(wordList);
				
				//Player 3
				tokenizer = new StringTokenizer(in.readLine());
				while(tokenizer.hasMoreTokens()) {
					temp = tokenizer.nextToken();
					//Word not added
					if(wordList.get(temp) == null) {
						wordList.put(temp, new ArrayList<Integer>());
						wordList.get(temp).add(2);
					}
					else {
						wordList.get(temp).add(2);
					}
				}
				//System.out.println(wordList);
				
				for (Object key : wordList.keySet()) {
					ArrayList<Integer> words = wordList.get(key);
					if(words.size() == 1) {
						scoreCard[words.remove(0)] += 3;
					}
					else if(words.size() == 2) {
						scoreCard[words.remove(0)] += 2;
						scoreCard[words.remove(0)] += 2;
					}
					else {
						scoreCard[words.remove(0)] += 1;
						scoreCard[words.remove(0)] += 1;
						scoreCard[words.remove(0)] += 1;
					}
				}
				
				System.out.printf("%d/%d/%d\n", scoreCard[0], scoreCard[1], scoreCard[2]);
				in.readLine();
			}
		} catch (Exception e) {}
	}
}