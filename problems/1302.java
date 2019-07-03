import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String input = in.readLine();
		
		String part[] = {"..#.","..#.","..*."};
		String part2[] = {".#.#",".#.#",".*.*"};
		
		for (int i = 0; i < input.length(); i++) {
			System.out.print(part[i%3]);
		}
		System.out.println(".");
		
		for (int i = 0; i < input.length(); i++) {
			System.out.print(part2[i%3]);
		}
		System.out.println(".");
		
		for (int i = 0; i < input.length(); i++) {
			System.out.print((i%3 == 2 || (i%3 == 0 && i > 0) ? "*." : "#.") + input.charAt(i) + ".");
		}
		System.out.println(input.length()%3 == 0 ? "*" : "#");
		
		for (int i = 0; i < input.length(); i++) {
			System.out.print(part2[i%3]);
		}
		System.out.println(".");
		
		for (int i = 0; i < input.length(); i++) {
			System.out.print(part[i%3]);
		}
		System.out.println(".");
	}

}
