import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String number = in.readLine();
		
		while(!number.equals("0")) {
			
			int i;
			int length = number.length();
			int sum = 0;
			int degree = 1;
			for (i = 0; i < length; i++) {
				sum += number.charAt(i) - '0';
			}
			if(sum % 9 == 0) {
				System.out.printf("%s is a multiple of 9 and has 9-degree %d.\n", number, degree + degree(sum));
			}
			else {
				System.out.println(number + " is not a multiple of 9.");
			}
			number = in.readLine();
		}
	}
	
	public static int degree(int number) {
		int degree = 0;
		int sum = 0;
		while(number > 9) {
			degree++;
			sum = 0;
			while (number > 0){
				sum += number % 10;
				number /= 10;
			}
			number = sum;
		}
		return degree;
	}
}