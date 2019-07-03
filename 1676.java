import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		long input = Integer.parseInt(reader.readLine());
		int caseNum = 1;
		while(input != 0) {
			System.out.printf("Case %d:\nn = %d, diamonds = %d\n", caseNum++, input, input*(input+1)*(2*input+1)/6);
			input = Integer.parseInt(reader.readLine());
		}
	}

}
