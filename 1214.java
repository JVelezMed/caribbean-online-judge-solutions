import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat fff = new DecimalFormat("0.00");
		int cases = Integer.parseInt(in.readLine());
		String[] str;
		double area, sum, d1, d2;
		
		for (int i = 0; i < cases; i++) {
			str = in.readLine().split(" ");
			area = Double.parseDouble(str[0]);
			sum = Double.parseDouble(str[1]);
			d1 = (sum + Math.sqrt(Math.abs(sum*sum - 8*area))) / 2.0;
			d2 = (sum - Math.sqrt(Math.abs(sum*sum - 8*area))) / 2.0;
			
			System.out.println(fff.format(Math.sqrt(d1 * d1 / 4 + d2 * d2 / 4)));
		}
	}
}