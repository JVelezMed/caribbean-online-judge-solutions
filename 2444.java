import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class uCalculateE {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		tok = new StringTokenizer(in.readLine());
		int total = tok.countTokens();
		while(tok.hasMoreElements()) {
			int number = Integer.parseInt(tok.nextToken());
			//System.out.println(Integer.toBinaryString(number));
			if(Integer.bitCount(number) % 2 == 1) {
				total--;
			}
		}
		System.out.println(total);
	}
}