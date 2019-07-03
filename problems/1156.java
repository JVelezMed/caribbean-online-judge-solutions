import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());;

		while(num != 42) {
			System.out.println(num);
			num = Integer.parseInt(in.readLine());
		}
	} 
}