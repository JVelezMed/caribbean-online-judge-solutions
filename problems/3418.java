import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		String text;
		int arr[] = new int[26];
		
		try {
			while(true) {
				text = in.readLine();
				
				int len = text.length();
				for (int i = 0; i < len; i++) {
					char letter = Character.toLowerCase(text.charAt(i));
					if(Character.isLetter(text.charAt(i))) {
						arr[letter - 'a']++;
					}
				}
			}
		} catch (Exception e) {}
		
		System.out.printf("%d %d %d %d %d\n",
				arr['a' - 'a'],
				arr['e' - 'a'],
				arr['i' - 'a'],
				arr['o' - 'a'],
				arr['u' - 'a']);
	}
}