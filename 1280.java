import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		//Wrong things, easy to fix
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String str = in.readLine();
		int n;
		
		while(!str.equals("0")) {
			n = Integer.parseInt(str);
			System.out.println(n + " => " + (n * n - (n - 1)));
			str = in.readLine();
		}
	}
}