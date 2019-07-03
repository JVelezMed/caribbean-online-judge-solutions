import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());
		StringBuilder str;
		String num;
		
		for (int i = 0; i < cases; i++) {
			num = in.readLine();
			if(num.length() == 1)
				System.out.println((Integer.parseInt(num) % 4 == 0) ? "YES" : "NO");
			else {
				str = new StringBuilder(num);
				num = str.substring(num.length() - 2);
				System.out.println((Integer.parseInt(num) % 4 == 0) ? "YES" : "NO");
			}	
		}
	}
}