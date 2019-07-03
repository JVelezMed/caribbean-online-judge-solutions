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
		
		BigInteger sum = BigInteger.ZERO;
		while(cases-- > 0) {
			sum = sum.add(new BigInteger(in.readLine()));
		}
		System.out.println(sum);
	}
}