import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String input = in.readLine().replaceAll(" ", "");
				
		boolean ok = true;
		
		int len = input.length();
		for (int i = 0; i <= len / 2 && ok; i++) {
			if(input.charAt(i) != input.charAt(len - i - 1)) {
				ok = false;
			}
		}
		
		System.out.println(ok ? "Yes" : "No");
	}
}
