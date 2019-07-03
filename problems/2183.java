import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;
		
		int cases = Integer.parseInt(reader.readLine());
		int oddEven[];
		while(cases-- > 0) 
		{
			oddEven = new int[2];
			String word = reader.readLine();
			
			for (int i = 0; i < word.length(); i++) {
				++oddEven[word.charAt(i) & 1];
			}
		
			System.out.println(oddEven[0] > oddEven[1] ? "Even" : "Odd");
		
		}
	}
}
