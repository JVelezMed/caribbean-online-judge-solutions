import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());
		String[] str;
		long sum;
		
		for (int i = 0; i < cases; i++) {
			sum = 0;
			str = in.readLine().split(" ");
			for (int j = Integer.parseInt(str[0]); j <= Integer.parseInt(str[1]); j++) {
				sum += j * (j+1) * (j+2);
			}
			System.out.println(sum % 100);
		}
	}
}