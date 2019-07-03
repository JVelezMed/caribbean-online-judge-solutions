import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static long precalculatedSum[] = new long[58];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		//Precalculate the sum of ones for powers of two minus one (2^n) - 1
		precalculatedSum[0] = 1;
		//System.out.println("i: " + 0 + " Sum:" + precalculatedSum[0]);
		for (int i = 1; i < precalculatedSum.length; i++) {
			precalculatedSum[i] = 2*precalculatedSum[i-1] + (long)Math.pow(2, i);
			//System.out.println("i: " + i + " Sum:" + precalculatedSum[i]);
		}

		int cases = Integer.parseInt(in.readLine());

		while(cases-- > 0) {
			//Get the user input
			StringTokenizer tok = new StringTokenizer(in.readLine());
			long a = Long.parseLong(tok.nextToken());
			long b = Long.parseLong(tok.nextToken());

			if(a == b) {
				System.out.println(Long.bitCount(a));
			}
			else {
				System.out.println(sumOfOnes(b) -  sumOfOnes(a) + Long.bitCount(a));
			}
		}

	}

	public static int numOfBits(long number) {
		return Long.toBinaryString(number).length();
	}

	public static long sumOfOnes(long number) {
		//Get the number of bits from the number
		int bitCount = numOfBits(number);
		long sum = 0;
		if(number == 0 || number == 1) {
			//System.out.println("In");
			return number;
		}
		else if(number == ((long)(Math.pow(2, bitCount)) - 1)) {	//Number is of form (2^n) - 1
			//System.out.println(precalculatedSum[bitCount-1]);
			return precalculatedSum[bitCount-1];
		}
		else {
			sum += precalculatedSum[bitCount-2] + (number - ((long)(Math.pow(2, bitCount-1)) - 1));
			number -= (long)(Math.pow(2, bitCount-1));
			//System.out.println("Number is now: " + number);
			return sum + sumOfOnes(number);
		}
	}
}