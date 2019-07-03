import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = in.readLine();
		
		while(!input.equals("END")) {
			if(input.equals("1")) {
				System.out.println(1);
			}
			else if(input.length() < 2) {
				System.out.println(2);
			}
			else if(input.length() < 10) {
				System.out.println(3);
			}
			else {
				System.out.println(4);
			}
			input = in.readLine();
		}
	}
}