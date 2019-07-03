import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases, questions;
		
		StringTokenizer tokenizer = new StringTokenizer(in.readLine());
		cases = Integer.parseInt(tokenizer.nextToken());
		questions = Integer.parseInt(tokenizer.nextToken());
		
		HashMap<String, String> set = new HashMap<String, String>();
		
		//Read the initial equations
		for (int i = 0; i < cases; i++) {
			tokenizer = new StringTokenizer(in.readLine(), " ");
			if (tokenizer.countTokens() == 1) {
				set.put(tokenizer.nextToken(), "");
			}
			else
				set.put(tokenizer.nextToken(), tokenizer.nextToken());
		}
		
		//Receive the questions
		for (int i = 0; i < questions; i++) {
			tokenizer = new StringTokenizer(in.readLine(), " ");
			if (tokenizer.countTokens() == 1) {
				System.out.println("not found");
			}
			else {
				if(set.get(tokenizer.nextToken()).equals(tokenizer.nextToken()))
					System.out.println("ok");
				else
					System.out.println("wrong");
			}
		}
	}
}