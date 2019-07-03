import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			try {
				BigInteger number = new BigInteger(in.readLine());
				BigInteger two = BigInteger.valueOf(2);

				if(number.equals(BigInteger.ONE))
					System.out.println("1");
				else
					System.out.println(two.multiply(number).subtract(two));
			} catch (Exception e) {
				System.exit(0);
			}
		}
	}
}