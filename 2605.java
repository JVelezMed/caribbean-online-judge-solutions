import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(in.readLine());

		switch (number) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(7);
			break;
		case 3:
			System.out.println(2);
			break;
		case 4:
			System.out.println(3);
			break;

		default:
			break;
		}
	}
}