import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases =Integer.parseInt(in.readLine());
		String str;
		int sum, sum2;

		for (int i = 0; i < cases; i++) {
			sum = 0;
			sum2 = 0;
			str = in.readLine();
			if( (str.charAt(str.length() - 1) -'0') % 5 == 0 ) {
				for (int j = 0; j < str.length(); j++) {
					sum += str.charAt(j) - '0';
					sum2 += str.charAt(j) - '0';
					
					if(j + 1 < str.length()) {
						sum -= str.charAt(++j) - '0';
						sum2 += str.charAt(j) - '0';
					}
				}
				System.out.println((sum2 % 9 == 0 && sum % 11 == 0) ? "YES" : "NO");	
			}
			else
				System.out.println("NO");
		}
	}
}