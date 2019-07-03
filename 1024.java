import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		double sum, limit;
		String str = in.readLine();

		while(!str.equals("0.00")) {
			limit = Double.parseDouble(str);
			sum = 0.0;
			for (int i = 2; ; i++) {
				sum += 1.0 / i;
				if(sum >= limit) {
					System.out.println(i-1 + " card(s)");
					break;
				}
			}
			str = in.readLine();
		}
	}
}