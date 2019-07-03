import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] str = in.readLine().split(" ");
		int R1 = Integer.parseInt(str[0]), 
			S = Integer.parseInt(str[1]);
		
		System.out.println(2 * S - R1);	
	}
}