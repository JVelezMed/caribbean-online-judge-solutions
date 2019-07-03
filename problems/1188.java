import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] num = in.readLine().split(" ");
		int sum = 0;
		
		for (int i = 0; i < num[0].length(); i++) {
			for (int j = 0; j < num[1].length(); j++) {
				sum += (num[0].charAt(i) - '0') * (num[1].charAt(j) - '0');
			}
		}
		System.out.println(sum);
	}
}