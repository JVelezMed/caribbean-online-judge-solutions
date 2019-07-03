import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str;
		int base, exponent;
		String input = in.readLine();
		
		while(!input.equals("0 0")) {
			str = input.split(" ");
			base = str[0].charAt(str[0].length() - 1) - '0';
			exponent = str[1].length() < 2 ? 
					   (str[1].charAt(str[1].length() - 1) - '0') : 
					   (str[1].charAt(str[1].length() - 1) - '0') + (str[1].charAt(str[1].length() - 2) - '0') * 10;
		
			if(exponent == 0)
				System.out.println(1);
			else {
				switch (base) {
				case 0:
					System.out.println(0);
					break;
					
				case 1:
					System.out.println(1);
					break;
					
				case 2:
					if(exponent % 2 == 0)
						System.out.println((exponent / 2 % 2 == 0) ? 6 : 4);
					else 
						System.out.println(((exponent - 1) / 2 % 2 == 0) ? 2 : 8);
					break;
					
				case 3:
					if(exponent % 2 == 0)
						System.out.println((exponent / 2 % 2 == 0) ? 1 : 9);
					else 
						System.out.println(((exponent - 1) / 2 % 2 == 0) ? 3 : 7);
					break;
					
				case 4:
					System.out.println((exponent % 2 == 0) ? 6 : 4);
					break;
					
				case 5:
					System.out.println(5);
					break;
					
				case 6:
					System.out.println(6);
					break;
					
				case 7:
					if(exponent % 2 == 0)
						System.out.println((exponent / 2 % 2 == 0) ? 1 : 9);
					else 
						System.out.println(((exponent - 1) / 2 % 2 == 0) ? 7 : 3);
					break;
					
				case 8:
					if(exponent % 2 == 0)
						System.out.println((exponent / 2 % 2 == 0) ? 6 : 4);
					else 
						System.out.println(((exponent - 1) / 2 % 2 == 0) ? 8 : 2);
					break;
					
				case 9:
					System.out.println((exponent % 2 == 0) ? 1 : 9);
					break;
				}
			}
			input = in.readLine();
		}
	}
}