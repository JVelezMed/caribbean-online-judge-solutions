import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;
		
		int cases = Integer.parseInt(reader.readLine());
		
		TreeSet<Long> set = new TreeSet<Long>();
		
		while(cases-- > 0) {
			tok = new StringTokenizer(reader.readLine());
			
			tok.nextToken();
			while(tok.hasMoreTokens()) {
				set.add(Long.parseLong(tok.nextToken()));
			}
		}
		
		System.out.println(set.size());
		
	}

}