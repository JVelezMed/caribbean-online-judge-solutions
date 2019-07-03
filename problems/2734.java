import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;
		int accum = 0;

		try {
			while (true) {
				tok = new StringTokenizer(in.readLine());
				
				String op = tok.nextToken();
				int num = Integer.parseInt(tok.nextToken());
				
				if(op.equals("suma")) {
					accum += num;
				}
				else {
					accum -= num;
				}
			}
		} catch (Exception e) {}
		
		System.out.println("resultado: " + accum);
	}
}