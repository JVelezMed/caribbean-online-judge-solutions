import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int number = Integer.parseInt(in.readLine());
		int max;
		
		while(number > 0) {
			max = number;
			
			while(number > 1) {
				if(number % 2 == 1) {
					number = 3*number + 1;
					max = number > max ? number : max;
				}
				else {
					number >>= 1;
				}
			}
			System.out.println(max);
			
			number = Integer.parseInt(in.readLine());
		}
	}
	
}