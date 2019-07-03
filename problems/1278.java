import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		String input = in.readLine();
		
		int array[];
		while(!input.equals("0 0 0 0 0 0")) {
			tok = new StringTokenizer(input);
			array = new int[6];
			
			for (int i = 0; i < array.length; i++) {
				array[i] = Integer.parseInt(tok.nextToken());
			}
			
			Arrays.sort(array);
			
			double average = (array[1]+array[2]+array[3]+array[4])/4.0;
			System.out.println((new DecimalFormat("#.#####")).format(average));
			
			input = in.readLine();
		}
	}
}