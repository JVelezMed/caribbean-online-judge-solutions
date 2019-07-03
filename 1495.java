import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int elem = Integer.parseInt(in.readLine());
		int[] numbers = new int[elem];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(in.readLine());
		}
		
		int low;
		for (int i = 0; i < numbers.length - 1; i++) {
			low = i;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] < numbers[low]) {
					low = j;
				}
			}
			numbers[i] = numbers[i] + numbers[low] - (numbers[low] = numbers[i]);
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}