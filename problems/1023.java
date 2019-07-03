import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat fff = new DecimalFormat("#.00");
		double sum = 0.0;
		for (int i = 1; i <= 12; i++) {
			sum += Double.parseDouble(in.readLine());
		}
		System.out.println("$" + fff.format(sum/12));

	}
}