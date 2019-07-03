import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int cases = Integer.parseInt(in.readLine());
		
		while(cases-- > 0) {
			long shift = Long.parseLong(in.readLine());
			String word = in.readLine();
			
			int len = word.length();
			for(int start = (int) (len-shift%len), count = 0; count < len; count++) {
				System.out.print(word.charAt((start+count)%len));
			}
			System.out.println();
		}
	}

}
