import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		
		while(!str.equals("#")) {
			for (int i = 0; i < str.length(); i++) {
				switch(str.charAt(i)) {
					case ' ':
						System.out.print("%20");
						break;
						
					case '!':
						System.out.print("%21");
						break;
						
					case '$':
						System.out.print("%24");
						break;
						
					case '%':
						System.out.print("%25");
						break;
						
					case '(':
						System.out.print("%28");
						break;
						
					case ')':
						System.out.print("%29");
						break;
						
					case '*':
						System.out.print("%2a");
						break;
						
					default:
						System.out.print(str.charAt(i));
				}
			}
			System.out.println();
			str = in.readLine();
		}
	}
}