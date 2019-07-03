import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;
		int goodHouses;

		try {
			while (true) {
				tok = new StringTokenizer(in.readLine());
				
				int firstStreet = Integer.parseInt(tok.nextToken());
				int lastStreet = Integer.parseInt(tok.nextToken());
				
				goodHouses = 0;
				
				for (int i = firstStreet; i <= lastStreet; i++) {
					String num = String.valueOf(i);
					HashSet<Character> dist = new HashSet<Character>();

					for (int j = 0; j < num.length(); j++) {
						dist.add(num.charAt(j));
					}
										
					if(dist.size() == num.length()) {
						++goodHouses;
					}
				}
				
				System.out.println(goodHouses);
			}
		} catch (Exception e) {}
	}
}