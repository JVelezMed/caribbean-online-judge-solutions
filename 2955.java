import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main
{
	public static BigInteger precalcSum[];
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		precalcSum = new BigInteger[31];
		precalcSum[0] = BigInteger.ZERO;
		int length = precalcSum.length;
		for (int i = 1; i < length; i++) {
			precalcSum[i] = BigInteger.valueOf(3).
					multiply(BigInteger.valueOf(4).pow(i-1)).
					multiply(BigInteger.valueOf(2).pow(i-1)).
					add(precalcSum[i-1]);
			//System.out.println(precalcSum[i]);
		}

		int cases = Integer.parseInt(in.readLine());
		while(cases-- > 0) {
			StringTokenizer tok = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(tok.nextToken()) - 1;
			int b = Integer.parseInt(tok.nextToken());

			int level1 = (a == 0) ? 1 : (int)(Math.log(Math.sqrt(a)) / Math.log(2)) + 1;
			int level2 = (int)(Math.log(Math.sqrt(b)) / Math.log(2)) + 1;
			//System.out.println("Level a is:" + level1);
			//System.out.println("Level b is:" + level2);

			BigInteger total1 = sum(a, level1);
			//System.out.println(total1);
			BigInteger total2 = sum(b, level2);
			//System.out.println(total2);

			System.out.println(total2.subtract(total1));
		}
	}

	public static BigInteger sum(int num, int level) {
		if(num <= 3) {
			return BigInteger.valueOf(num);
		}
		else {
			BigInteger power2 = BigInteger.valueOf(2).pow(level - 1);
			BigInteger power4 = BigInteger.valueOf(4).pow(level - 1).subtract(BigInteger.ONE);
			//System.out.println("Powers: " + power2 + " " + power4);
			//System.out.println(precalcSum[level - 1]);
			return precalcSum[level - 1].
					add(
							BigInteger.valueOf(num).
							subtract(power4).
							multiply(power2)
							);
		}
	}

}