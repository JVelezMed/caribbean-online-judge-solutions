import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = in.readLine();
		String[] str;
		int charsFound = 0;
		int next;

		//sequence subsequence

		try {
			while(true) {
				str = input.split(" ");
				charsFound = next = 0;
				for (int i = 0; i < str[0].length() && next < str[1].length();) {
					if(str[0].charAt(i) == str[1].charAt(next)) { 
						charsFound++;
						next++;
						i++;
					}
					else
						next++;
				}
				System.out.println(charsFound == str[0].length()? "Yes" : "No");
				input = in.readLine();
			}
		} catch (Exception e) {}
	}
}