import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());
		String num;
		int sum;
		
		for (int i = 0; i < cases; i++) {
			sum = 0;
			num = in.readLine();
			for (int j = 0; j < num.length(); j++) {
				sum += num.charAt(j) - '0';
			}
			
			System.out.println(((num.charAt(num.length() - 1) - '0') % 2 == 0 && 
					sum % 3 == 0) ? "YES" : "NO");
		}	
		
	}
}
