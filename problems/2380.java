import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int numbers = Integer.parseInt(in.readLine());
		int sum = 0;
		
		while(numbers-- > 0) {
			sum += Integer.bitCount(Integer.parseInt(in.readLine()));
		}
		System.out.println(sum);
	}
}