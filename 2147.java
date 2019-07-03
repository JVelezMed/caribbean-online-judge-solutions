
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class uCalculateE {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());
		StringTokenizer tokernizer;
		
		String word;
		for(int i = 0; i < cases; ++i) {
			tokernizer = new StringTokenizer(in.readLine());
			word = tokernizer.nextToken();
			int shift = Integer.parseInt(tokernizer.nextToken());
			int length = word.length();
			shift %= length;
			
			int count = 0;
			while(count < length) {
				System.out.print(word.charAt((length-shift+count)%length));
				count++;
			}
			System.out.println();
		}
	}
}