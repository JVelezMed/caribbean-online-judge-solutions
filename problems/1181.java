import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int years = Integer.parseInt(reader.readLine());
		int males;
		int females;
		while(years != -1) {
			males = fibonacciSum(years);
			females = fibonacciSum(years - 1);
			System.out.println(males + " " + (males + females + 1));
			years = Integer.parseInt(reader.readLine());
		}
	}
	
	private static int fibonacciSum(int term) {
		int fib1 = 0, fib2 = 1;
		int temp;
		int sum = 0;
		for (int i = 0; i < term; i++) {
			temp = fib1 + fib2;
			fib1 = fib2;
			fib2 = temp;
			sum += fib1;
		}
		return sum;
	}
}