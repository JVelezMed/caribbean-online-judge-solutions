import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		int sum, sum2;
		try {
			while (true) {
				sum = sum2 = 0;
				for (int i = 1; i <= n; i++) {
					sum += (i * i);
					sum2 += i * i * (i - 1);
				}
				System.out.println(sum + " " + (sum + sum2));
				n = Integer.parseInt(in.readLine());
			}
		} catch (Exception e) {}
	}
}