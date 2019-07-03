import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer tok = new StringTokenizer(reader.readLine(), " ");
		
		HashSet<Integer> numbers = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			numbers.add(Integer.parseInt(reader.readLine()) % 42);
		}
		
		System.out.println(numbers.size());
		
		
		
	}

}
