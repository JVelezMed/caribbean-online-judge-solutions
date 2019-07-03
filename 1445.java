import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String input = reader.readLine();
		
		String[] numbers;
		int a, b, c;
		
		while(!input.equals("0 0 0")) {
			numbers = input.split(" ");
			a = Integer.parseInt(numbers[0]); 
			b = Integer.parseInt(numbers[1]); 
			c = Integer.parseInt(numbers[2]);
			if(b-a == c-b) {
				System.out.println("AP " + (c + c - b));
			}
			else
				System.out.println("GP " + c * c / b);
			
			input = reader.readLine();
		}
	}
}