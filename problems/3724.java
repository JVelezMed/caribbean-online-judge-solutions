import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		String time = in.readLine();
		
		String ampm = time.substring(8, 10);
		
		int hour = Integer.parseInt(time.substring(0,2));
		int military = hour;
		
		if(ampm.equals("AM") && hour == 12) {
			military = 0;
		}
		else if(ampm.equals("PM") && hour == 12) {
			military = 12;
		}
		if(ampm.equals("PM") && hour != 12) {
			military += 12;
		}
		
		System.out.printf("%02d:%02d:%02d\n", military
				, Integer.parseInt(time.substring(3,5))
				, Integer.parseInt(time.substring(6,8)));
	}
}