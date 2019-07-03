import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		//Wrong things, easy to fix
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());
		String[] str;
		
		for (int i = 0; i < cases; i++) {
			str = in.readLine().split(" ");
			System.out.print(str[0].charAt(0) + "" + str[0].charAt(1) + "" + str[0].charAt(2));
			System.out.print(str[1]);
			for (int j = 2; j < str.length; j++) {
				System.out.print("*" + str[j]);
			}
			System.out.println(str[0].charAt(3) + "" + str[0].charAt(4) + "" + str[0].charAt(5));
		}
	}
}