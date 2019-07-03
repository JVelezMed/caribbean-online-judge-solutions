import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());
		
		while(cases-- > 0) {
			int number = Integer.parseInt(in.readLine());
			if(number==1 || number==2 || number==4 || number==8 || number==16 || number==32 || 
					number==64 || number==128 || number==256 || number==512) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		
	}
}