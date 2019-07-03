import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num;
		try {
			while(true) {
				num = Integer.parseInt(in.readLine());
				System.out.println((num % 6 == 0 && num <= 180) ? "Y" : "N");
			}
		} catch (Exception e) {}
	}
}