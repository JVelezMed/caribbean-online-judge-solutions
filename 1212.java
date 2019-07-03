import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		int rightOnes;
		int sum;
		while(!str.equals("*")) {
			sum = 0;
			rightOnes = 0;
			for (int i = 1; i < str.length(); i++) {
				switch(str.charAt(i)) {
				case 'W':
					sum += 64;
					break;
				case 'H':
					sum += 32;
					break;
				case 'Q':
					sum += 16;
					break;
				case 'E':
					sum += 8;
					break;
				case 'S':
					sum += 4;
					break;
				case 'T':
					sum += 2;
					break;
				case 'X':
					sum += 1;
					break;
				case '/':
					if(sum == 64)
						rightOnes++;
					sum = 0;
					break;
				}
			}
			System.out.println(rightOnes);
			str = in.readLine();
		}
	}
}