import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int cases = Integer.parseInt(in.readLine());
		String encoded;
		LinkedList<Integer> idxs;
		
		for (int i = 1; i <= cases; i++) {
			encoded = in.readLine();
			idxs = new LinkedList<Integer>();
			
			for (int j = 0; j < encoded.length(); j++) {
				if(encoded.charAt(j) >= 'A' && encoded.charAt(j) <= 'Z') {
					idxs.add(j);
				}
			}
			idxs.add(encoded.length());
			
			int start, end;
			
			System.out.printf("Case %d: ", i);
			for (int j = 0; j < idxs.size() - 1; j++) {
				start = idxs.get(j)+1;
				end = idxs.get(j+1);
				char letter = encoded.charAt(start-1);
				
				int number = Integer.parseInt(encoded.substring(start, end));
				
				for (int k = 1; k <= number; k++) {
					System.out.print(letter);
				}
			}
			System.out.println();
		
		}
		

	}

}