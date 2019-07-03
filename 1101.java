import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;
		StringBuilder out;
		// TODO Auto-generated method stub
		int cases = Integer.parseInt(in.readLine());
		
		int palindrome[] = new int[200000];
		for (int i = 1; i <= 200000; i++) {
			if(isBitPalindrome(i)) {
				palindrome[i-1] = 1;
			}
		}

		while(cases-- > 0){
			out = new StringBuilder();
			tok = new StringTokenizer(in.readLine());
			int low = Integer.parseInt(tok.nextToken());
			int high = Integer.parseInt(tok.nextToken());
			for (int i = low; i <= high; i++) {
				if(palindrome[i-1] == 1) {
					out.append(i+" ");
				}
			}
			System.out.println(out.toString().trim());
		}
	}


	public static boolean isBitPalindrome(int x) {
		int reversed = 0, aux = x;
		while (aux > 0) {
			/* 
	                       Taking LSB of aux and putting it as LSB of reversed
	                       variable. Before doing that shifting reversed to 
	                       right, to build it from left to right.
			 */
			reversed = (reversed  << 1) | (aux & 1);

			/*
	                      Loop is depend of number of bits in aux. Taking next bit into 
	                      LSB position by shifting aux toward right once.
			 */
			aux = aux >> 1;
		}
		return (reversed  == x) ? true : false;
	}

}
