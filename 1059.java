import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num;
		int parity = 0;
		String binaryString = "";

		while((num = Integer.parseInt(in.readLine())) != 0) {
			parity = 0;
			binaryString = Integer.toBinaryString(num);
			for (int i = 0; i < binaryString.length(); i++) {
				if(binaryString.charAt(i) == '1')
					parity++;
			}
			System.out.println("The parity of " + binaryString + " is " + parity + " (mod 2)." );
		}
		
	}
}