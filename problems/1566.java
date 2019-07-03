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
		
		//(N * (N + 1) * (2N + 1)) / 6
		
		int number = Integer.parseInt(reader.readLine());
		
		while(number != 0) {
			System.out.println((number*(number+1)*(2*number + 1))/6);
			number = Integer.parseInt(reader.readLine());
		}
		
		
		
	}

}
