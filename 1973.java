import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger number = new BigInteger(in.readLine(), 2);
		
		System.out.println(number.multiply(BigInteger.valueOf(17)).toString(2));

	}
}