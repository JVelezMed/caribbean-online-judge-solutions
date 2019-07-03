import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BigInteger number;
		String input = in.readLine();
		StringBuilder answer;

		while(!input.equals("0")) {
			int power = 0;
			number = new BigInteger(input).subtract(BigInteger.ONE);
			answer = new StringBuilder();

			if(input.equals("1")) {
				answer.append("{ }");
			}
			else {
				answer.append("{ ");
				while(!number.equals(BigInteger.ZERO)) {
					BigInteger modulus = number.mod(BigInteger.valueOf(2));
					number = number.divide(BigInteger.valueOf(2));
					if(modulus.equals(BigInteger.ONE)) {
						answer.append(BigInteger.valueOf(3).pow(power) + ", ");
					}
					else {
						//System.out.println("ZERO");
					}
					power++;
				}
				answer.append("}");
				answer.deleteCharAt(answer.length() - 3);
			}

			System.out.println(answer);
			input = in.readLine();
		}

	}
}