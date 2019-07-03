import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			while(true) {
				long triangles;
				long quadrilaterals;
				
				StringTokenizer tok = new StringTokenizer(in.readLine());
				long a = Long.parseLong(tok.nextToken());
				long b = Long.parseLong(tok.nextToken());
				
				if(a == 0 || b == 0) {
					triangles = 0;
					quadrilaterals = 0;
				}
				else {
					triangles = a*(a-1)/2*b + b*(b-1)/2*a;
					quadrilaterals = a*(a-1)*b*(b-1)/4;
				}
				System.out.println("Triangles: " + triangles);
				System.out.println("Quadrilaterals: " + quadrilaterals);
				System.out.println();

			}
		} catch (Exception e) {
			System.exit(0);
		}
	}
}