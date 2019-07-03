import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int cases = Integer.parseInt(in.readLine());
		int children, candies;
		for (int i = 1; i <= cases; i++) {
			in.readLine();
			try {
				children = Integer.parseInt(in.readLine());
				candies = 0;
				for (int j = 1; j <= children; j++) {
					candies += Integer.parseInt(in.readLine());
				}
				System.out.println((candies % children == 0) ? "YES" : "NO");
			} catch (Exception e) {
				System.out.println("YES");
			}
		}
	}
}