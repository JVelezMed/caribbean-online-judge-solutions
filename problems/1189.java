import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String number = in.readLine();
		
		while(!number.equals("0")) {
			
			int length = number.length();
			int highestPower = length;
			int answer = 0;
			
			for (int i = 0; i < length; i++) {
				answer += (number.charAt(i) - '0')*(Math.pow(2, highestPower) - 1);
				highestPower--;
			}
			System.out.println(answer);
			number = in.readLine();	
		}
	}
}