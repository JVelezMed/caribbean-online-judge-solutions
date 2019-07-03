import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		
		if(num % 3 == 0)
			System.out.println(num * 2 / 3);
		else if(num % 3 == 1)
			System.out.println((num - 1) * 2 / 3);
		else
			System.out.println((num - 2) * 2 / 3 + 1);
	}
}