import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int cases = Integer.parseInt(in.readLine());

		int arr[];
		while(cases-- > 0) {
			arr = new int[26];
			
			in.readLine();
			String word = in.readLine();
			StringBuilder sol =  new StringBuilder();
			String middle = "";
			
			int len = word.length();
			
			for (int i = 0; i < len; i++) {
				arr[word.charAt(i) - 'A']++;
			}
			
			for (int i = 0; i < arr.length; i++) {
				if(middle.equals("") && arr[i] % 2 == 1) {
					middle = String.valueOf((char)('A' + i));
				}
				
				for (int j = 0; j < arr[i]/2; j++) {
					sol.append(String.valueOf((char)('A' + i)));
				}
			}
			
			System.out.println(sol + middle + sol.reverse());
		}
	}
}