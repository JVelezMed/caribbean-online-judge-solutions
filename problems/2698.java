import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String word = in.readLine();
		int sum = 0;
		int length = word.length();
		
		for (int i = 0; i < length; i++) {
			sum += word.charAt(i) - ('A' - 1);
		}
		System.out.println(sum);
	}
}