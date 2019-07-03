import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class uCalculateE {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer tok = new StringTokenizer(in.readLine());
		String number1, number2;
		number1 = tok.nextToken();
		number2 = tok.nextToken();
		
		int highest, lowest;
		number1 = number1.replace('6', '5');
		number2 = number2.replace('6', '5');
		lowest = Integer.parseInt(number1) + Integer.parseInt(number2);
		//System.out.println(number1 + " " + number2);

		number1 = number1.replace('5', '6');
		number2 = number2.replace('5', '6');
		highest = Integer.parseInt(number1) + Integer.parseInt(number2);
		//System.out.println(number1 + " " + number2);
	
		System.out.println(lowest + " " + highest);
	}
}