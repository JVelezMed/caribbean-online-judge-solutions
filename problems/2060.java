import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer;
		int number = Integer.parseInt(reader.readLine());
		int claims, sum;
		
		while(number != -1) {
			claims = sum = 0;
			tokenizer = new StringTokenizer(reader.readLine());
			for (int i = 1; i <= number; i++) {
				sum += Integer.parseInt(tokenizer.nextToken());
				if(sum != 0 && sum % 100 == 0) {
					claims++;
					sum %= 100;
				}
			}
			System.out.println(claims);
			number = Integer.parseInt(reader.readLine());
		}
	}
}