import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		String map = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
		tok = new StringTokenizer(in.readLine());
		
		int shift = Integer.parseInt(tok.nextToken());
		String input;
		
		while(shift > 0) {
			input = tok.nextToken();
			
			int len = input.length();
			for (int i = len - 1; i >= 0; i--) {
				char letter = input.charAt(i);
				
				switch (letter) {
				case '_':
					System.out.print(map.charAt((26+shift)%28));
					break;
				case '.':
					System.out.print(map.charAt((27+shift)%28));
					break;
				default:
					System.out.print(map.charAt((letter-'A'+shift)%28));
					break;
				}
			}
			System.out.println();
			
			tok = new StringTokenizer(in.readLine());
			shift = Integer.parseInt(tok.nextToken());
		}

	}

}
