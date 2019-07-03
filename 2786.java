import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int N = Integer.parseInt(in.readLine());
		
		System.out.println(N%2==0 ? N*N/2 : (N+1)*(N+1)/2 - N);
	}

}