import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BigInteger total;
		BigInteger more;
		BigInteger result;
		for (int i = 1; i <= 10; i++) {
			total = new BigInteger(reader.readLine());
			more = new BigInteger(reader.readLine());
			result = total.subtract(more).divide(new BigInteger("2"));
			System.out.println(result.add(more).toString());
			System.out.println(result.toString());
		}
	}
}