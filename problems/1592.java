import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int multiplications = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < multiplications; i++) {
			BigInteger bigNumber = new BigInteger("1");
			for (int j = 0; j < 2; j++) {
				bigNumber = bigNumber.multiply(new BigInteger(in.readLine()));
			}
			System.out.println(bigNumber.toString());
		}
	}
}