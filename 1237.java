import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok = new StringTokenizer(in.readLine());
		
		int a = Integer.parseInt(tok.nextToken());
		int b = Integer.parseInt(tok.nextToken());
		
		while(a != 0 || b != 0) {
			int min = 2*a - b;
			min = Math.min(2*b - a, min);
			if((a+b)%2 == 0) {
				min = Math.min((a+b)/2, min);
			}
			System.out.println(min);
			tok = new StringTokenizer(in.readLine());
			a = Integer.parseInt(tok.nextToken());
			b = Integer.parseInt(tok.nextToken());
		}
	}
}