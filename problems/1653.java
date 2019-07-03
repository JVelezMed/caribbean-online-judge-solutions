import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());
		
		while(cases-- > 0) {
			int number = Integer.parseInt(in.readLine());
			BigInteger answer = BigInteger.valueOf(3).pow(number).subtract(BigInteger.ONE);
			System.out.println(answer);
		}
	}
}