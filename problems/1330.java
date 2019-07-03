import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		String drinks[] = {"ABSINTH", "BEER", "BRANDY", "CHAMPAGNE", 
				"GIN", "RUM", "SAKE", "TEQUILA", "VODKA", "WHISKEY", "WINE"};
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int cases = Integer.parseInt(in.readLine());
		
		int clients;
		String input;
		int check;
		while(cases-- > 0) {
			clients = Integer.parseInt(in.readLine());
			check = 0;
			while(clients-- > 0) {
				input = in.readLine();
				//Pass is a number
				try {
					int number = Integer.parseInt(input);
					if(number < 18) {
						check++;
					}
				} catch (NumberFormatException e) {
					// Fail is a drink name
					int i;
					for (i = 0; i < 11; i++) {
						if(input.equals(drinks[i])) {
							check++;
							break;
						}
					}
				}
			}
			System.out.println(check);
		}
		
	}
}