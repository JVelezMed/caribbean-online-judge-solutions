import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	
	public static boolean isPrime[];
	public static int gaps[];
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;
		
		generatePrimes();
		
		int num = Integer.parseInt(in.readLine());
		
		while(num > 0) {
			
			System.out.println(gaps[num]);
			num = Integer.parseInt(in.readLine());
		}
		
		
	}
	
	public static void generatePrimes() {
		int N = 1300000;

        // initially assume all integers are prime
       isPrime = new boolean[N + 1];
       gaps = new int[N+1];
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        // mark non-primes <= N using Sieve of Eratosthenes
        for (int i = 2; i*i <= N; i++) {
            // if i is prime, then mark multiples of i as nonprime
            // suffices to consider mutiples i, i+1, ..., N/i
            if (isPrime[i]) {
                for (int j = i; i*j <= N; j++) {
                    isPrime[i*j] = false;
                }
            }
        }
        
        int nextPrime;
        for (int i = 2; i <= N; i++) {
			if(isPrime[i]) {
				gaps[i] = 0;
			}else {
				//No next prime initially
				nextPrime = -1;
				for (int j = i+1; nextPrime == -1 && j <= N; j++) {
					if(isPrime[j]) {
						nextPrime = j;
					}
				}
				
				if(nextPrime != -1) {
					for (int pos = i; pos < nextPrime; pos++) {
						gaps[pos] = nextPrime - i + 1;
					}
					i = nextPrime-1;
				}
			}
		}
        
	}
}
