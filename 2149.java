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
			String input = in.readLine();
			int upper = 0, lower = 0;
			int length = input.length();
			for(int i = 0; i < length; ++i) {
				if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
					lower++;
				}
				else {
					upper++;
				}
			}
			System.out.println(upper == lower ? "SI" : "NO");
		}
	}
}