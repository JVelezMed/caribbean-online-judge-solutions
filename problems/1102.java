import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String num = in.readLine();
		int sum = 0;
		
		while(!num.equals("0") ) {
			sum = 0;
			for (int i = 0; ; ) {
				if (i < num.length())
					sum += Integer.valueOf(String.valueOf(num.charAt(i++)));
				else
					break;
				if (i < num.length()) 
					sum -= Integer.valueOf(String.valueOf(num.charAt(i++)));
				else 
					break;
			}
			System.out.println(num + (sum % 11 == 0 ? " is a" : " is not a") + " multiple of 11.");
			num = in.readLine();
		}
	}
}