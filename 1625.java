import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> day = new HashMap<String, Integer>();

		day.put("JANUARY", 1);
		day.put("FEBRUARY", 2);
		day.put("MARCH", 3);
		day.put("APRIL", 4);
		day.put("MAY", 5);
		day.put("JUNE", 6);
		day.put("JULY", 7);
		day.put("AUGUST", 8);
		day.put("SEPTEMBER", 9);
		day.put("OCTOBER", 10);
		day.put("NOVEMBER", 11);
		day.put("DECEMBER", 12);

		int cases = Integer.parseInt(in.readLine());

		while(cases-- > 0) {
			StringTokenizer tok = new StringTokenizer(in.readLine());

			GregorianCalendar date = new GregorianCalendar(Integer.parseInt(tok.nextToken()), day.get(tok.nextToken())-1, Integer.parseInt(tok.nextToken())-1);

			//System.out.println(date.get(date.DAY_OF_WEEK));
			switch (date.get(Calendar.DAY_OF_WEEK)) {
			case 0:
				System.out.println("SUNDAY");
				break;
			case 1:
				System.out.println("MONDAY");
				break;
			case 2:
				System.out.println("TUESDAY");
				break;
			case 3:
				System.out.println("WEDNESDAY");
				break;
			case 4:
				System.out.println("THURSDAY");
				break;
			case 5:
				System.out.println("FRIDAY");
				break;
			case 6:
				System.out.println("SATURDAY");
				break;

			default:
				break;
			}
		}
	}
}