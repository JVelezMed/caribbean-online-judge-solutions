import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = in.readLine();
		String[] str;
		int groupsLength;
		
		while (!input.equals("0")) {
			str = input.split(" ");
			groupsLength = str[1].length() / Integer.parseInt(str[0]);
			for (int i = 0; i < str[1].length(); i += groupsLength) {
				for (int j = i + groupsLength - 1; j >= i; j--) {
					System.out.print(str[1].charAt(j));
				}
			}
			System.out.println();
			input = in.readLine();
		}
	}
}