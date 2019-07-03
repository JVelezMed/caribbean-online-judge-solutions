import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());
		for (int i = 1; i <= cases; i++) {
			System.out.println(
					(int)Math.ceil(-1 + Math.sqrt( Integer.parseInt(in.readLine())+1 ) )
					);				
		}
	}
}