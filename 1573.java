
import java.math.BigInteger;
import java.util.Scanner;

public class uCalculateE {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases;
		
		BigInteger sum;
		BigInteger number;

		cases = sc.nextInt();
		for(int i = 0; i < cases; ++i) {
			number = sc.nextBigInteger(16);
			//(n*(n+1))/2
			sum = number.multiply(number.add(BigInteger.valueOf(1))).divide(BigInteger.valueOf(2));

			if((sum.mod(number)).compareTo(BigInteger.valueOf(0)) == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}