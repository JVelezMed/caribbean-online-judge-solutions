import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder curves[] = new StringBuilder[15];
		curves[0] = new StringBuilder("L");
		
		int length = curves.length;
		
		for (int i = 1; i < length; ++i) {
			StringBuilder word = new StringBuilder("L");
			int wordLength = curves[i-1].length();
			
			for (int j = 0; j < wordLength; ++j) {
				word.append(curves[i-1].charAt(j));
				word.append((j % 2 == 0) ? "R" : "L");
			}
			//System.out.println(word);
			curves[i] = word;
		}
		//System.out.println("Done");
		
		int number = Integer.parseInt(in.readLine());
		
		while(number != -1) {
			System.out.println(number == 0 ? "" : curves[number-1]);
			number = Integer.parseInt(in.readLine());
		}
		
	}
}