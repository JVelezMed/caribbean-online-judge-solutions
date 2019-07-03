import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uCalculateE {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());
		for (int i = 1; i <= cases; i++) {
			System.out.println(Long.lowestOneBit(Long.parseLong(in.readLine())));
		}
	}
}