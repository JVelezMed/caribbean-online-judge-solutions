import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uCalculateE {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int cases = Integer.parseInt(in.readLine());
		
		int sum = 0;
		while(cases-- > 0) {
			String number = in.readLine();
			int length = number.length();
			if(length > 7) {
				sum = (sum +Integer.parseInt(number.substring(length-8))) % 128;
			}
			else {
				sum = (sum + Integer.parseInt(number)) % 128;
			}
		}
		System.out.println(sum);
	}
}