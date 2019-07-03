import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main
{
	public static BigInteger factorials[] = new BigInteger[2049];
	
	public static void main(String[] args) throws IOException
	{
		int length = factorials.length;
		factorials[0] = BigInteger.ONE;
		for (int i = 1; i < length; i++) {
			factorials[i] = factorials[i-1].multiply(BigInteger.valueOf(i));
		}
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());
		
		while(cases-- > 0) {
			int number = Integer.parseInt(in.readLine());
			int power = (int)(Math.ceil(Math.log(number + 1)/Math.log(2)));
			//System.out.println(power);
			
			//System.out.println(number + " vs. " + ((1 << (power - 1)) - 1));
			if(number == ((1 << power) - 1)) {
				System.out.println("0");
			}
			else {
				int levelBefore = (1 << (power-1)) - 1;
				int nodesInLevel = (int)Math.pow(2, power-1);
				number -= levelBefore;
				System.out.println(combinations(nodesInLevel, number).subtract(BigInteger.ONE).mod(BigInteger.valueOf(1000000007)));
			}
		}
	}
	
	public static BigInteger combinations(int num, int num2) {
		
		return factorials[num].divide(factorials[num-num2]).divide(factorials[num2]);
	}
}