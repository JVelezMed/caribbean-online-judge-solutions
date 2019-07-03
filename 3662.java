import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		String ans[] = new String[100001];
		for (int i = 2; i <= 100000; i++) {
			if(primeFactorsSum(i)-i == i) {
				ans[i] = i + " = 1";
				for (int j = 2; j < i; j++) {
					if(i%j == 0) {
						ans[i] += " + " + j;
					}
				}
			}
			else {
				ans[i] = i + " is NOT perfect.";
			}
		}

		int number = Integer.parseInt(in.readLine());

		while(number != -1) {

			System.out.println(ans[number]);
			number = Integer.parseInt(in.readLine());
		}

	}

	public static int primeFactorsSum(int n)
	{
		int reps = 0;
		int product = 1;

		// Print the number of 2s that divide n
		while (n%2 == 0)
		{
			n = n/2;
			reps++;
		}

		if(reps >= 1) {
			product *= (int)(Math.pow(2, reps+1)-1);
		}

		// n must be odd at this point. So we can skip one element
		for (int i = 3; i <= Math.sqrt(n); i = i+2)
		{
			reps = 0;
			// While i divides n, print i and divide n
			while (n%i == 0)
			{
				n = n/i;
				reps++;
			}
			if(reps >= 1) {
				product *= (int)((Math.pow(i, reps+1)-1)/(i-1));
			}
		}

		// This condition is to handle the case when n is a prime number
		// greater than 2
		if (n > 2) {
			product *= (n+1);
		}
		return product;
	}

}