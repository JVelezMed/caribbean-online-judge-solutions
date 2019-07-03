import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int cases = Integer.parseInt(in.readLine());
		int nums, odds = 0, evens = 0;
		
		for (int i = 0; i < cases; i++) {
			odds = evens = 0;
			nums = Integer.parseInt(in.readLine());
			String str = in.readLine();
			Scanner reader = new Scanner(str);
			
			for (int j = 0; j < nums; j++) {
				if(reader.nextInt() % 2 == 0)
					evens++;
				else 
					odds++;	
			}
			System.out.println(evens + " even and " + odds + " odd.");
		}
	}
}