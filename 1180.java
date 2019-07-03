import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int cases = Integer.parseInt(in.readLine());
		String[] str;
		for (int i = 0; i < cases; i++) {
			str = in.readLine().split(" ");
			System.out.println((1 - Integer.parseInt(str[0])) + " " + 
							   (1 - Integer.parseInt(str[1])) + " " + 
							   (2 - Integer.parseInt(str[2])) + " " + 
							   (2 - Integer.parseInt(str[3])) + " " + 
							   (2 - Integer.parseInt(str[4])) + " " + 
							   (8 - Integer.parseInt(str[5])));
		}
	}
}