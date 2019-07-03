import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		String str;
		
		while(num != -1) {
			str = "";
			while(num > 2) {
				str = num % 3 + str;
				num /= 3;
			}
			System.out.println(num + str);
			num = Integer.parseInt(in.readLine());
		}
	}
}