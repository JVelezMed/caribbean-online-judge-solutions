import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class uCalculateE {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		//int cases = Integer.parseInt(in.readLine());

		StringTokenizer tokenizer;
		String hour, minutes;
		String formatLetters;
		int tHour, iMinutes;
		while(true) {
			try {
				tokenizer = new StringTokenizer(in.readLine(), ":");
				hour = tokenizer.nextToken();
				tHour = Integer.parseInt(hour);

				//Valid hour
				if(tHour >= 0 && tHour <= 23) {
					tokenizer = new StringTokenizer(tokenizer.nextToken(), " ");
					minutes = tokenizer.nextToken();
					//Valid minutes length of string
					if(minutes.length() == 2) {
						iMinutes = Integer.parseInt(minutes);
						
						//Valid minutes
						if(iMinutes >= 0 && iMinutes <= 59) {
							//No format words? Valid
							if(!tokenizer.hasMoreTokens()) {
								System.out.println("VALID");
							}
							else {
								formatLetters = tokenizer.nextToken().toLowerCase();
								//12 hour format
								if(tHour <= 12) {
									//Special case, hour is cero or the single digit military hour
									if(tHour == 0 || hour.length() == 2) {
										if(formatLetters.equals("hrs"))
											System.out.println("VALID");
										else
											System.out.println("INVALID");
									}
									else if(formatLetters.equals("am") || formatLetters.equals("pm") ||
										formatLetters.equals("hrs")) {
										System.out.println("VALID");
									}
									else
										System.out.println("INVALID");
								}
								//24 hour format
								else {
									if(formatLetters.equals("hrs")) {
										System.out.println("VALID");
									}
									else
										System.out.println("INVALID");
								}
							}
						}
						//Invalid minutes
						else {
							System.out.println("INVALID");
						}
					}
					//Not Valid
					else {
						System.out.println("INVALID");
					}
				}
				//Not valid, over 24
				else {
					System.out.println("INVALID");
				}

			} catch (Exception e) {
				System.exit(0);
			}
		}
	}
}