import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int radius = Integer.parseInt(in.readLine());
		int damage = 4*radius;
		System.out.print("A");
		for (int i = 1; i <= damage; i++) {
			System.out.print("a");
		}
		System.out.println("h");

	}
}