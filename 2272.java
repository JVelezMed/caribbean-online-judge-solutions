import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class uCalculateE {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());
		BigInteger number;
		
		for (int i = 0; i < cases; i++) {
			number = new BigInteger(in.readLine());
			if(number.equals(BigInteger.ONE)) {
				System.out.println("2");
			}
			else 
				System.out.println(number.isProbablePrime(1) ? number.toString() : number.nextProbablePrime());
		}
	}
}