import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	
	public static long precalc[] = new long[10];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		String word = in.readLine();
		StringBuilder half1 = new StringBuilder(word.substring(0, word.length()/2));
		StringBuilder half2;
		if(word.length() % 2 == 1) {
			half2 = new StringBuilder(word.substring(word.length()/2+1));
		}
		else {
			half2 = new StringBuilder(word.substring(word.length()/2));
		}
		
		
		System.out.println(half1.reverse().toString() + (word.length()%2==1 ? word.charAt(word.length()/2) : "") + half2.reverse().toString());
		
		
	}
}
