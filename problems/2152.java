import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());
		while(cases-- > 0) {
			int sum = 0;
			String number = in.readLine();
			if(number.charAt(0) == '-') {
				number = number.replace("-","");
			}
			int length = number.length();
			for (int i = 0; i < length; i++) {
				sum += number.charAt(i) - '0';
			}
			System.out.println(sum);
		}
	}
}