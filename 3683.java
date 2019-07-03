import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int cases = Integer.parseInt(in.readLine());
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(0);
		set.add(1000000);
		
		int num;
		while(cases-- > 0) {
			num = Integer.parseInt(in.readLine());
			System.out.println((set.contains(num) ? num : set.lower(num)) + " " + (set.contains(num) ? num : set.higher(num)));
			set.add(num);
		}
	}
}