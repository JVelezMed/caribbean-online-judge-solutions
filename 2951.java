import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;


public class Main {

	static Set<String> keys;
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int cases = Integer.parseInt(in.readLine());
		keys = new TreeSet<String>();
		while(cases-- > 0) {
			String number = in.readLine();
			int length = number.length();
			int array[] = new int[length];
			
			int len = array.length;
			for (int i = 0; i < len; i++) {
				array[i] = number.charAt(i) - '0';
			}
			Arrays.sort(array);
			
			StringBuilder newNum = new StringBuilder("");
			for (int i = len - 1; i >= 0; i--) {
				newNum.append((char)(array[i] + '0'));
			}
			//System.out.println(newNum);
			keys.add(newNum.toString());	
		}
		
		System.out.println(keys.size());
	}
}
