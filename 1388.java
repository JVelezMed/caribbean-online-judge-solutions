import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		//Wrong things, easy to fix
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());
		String[] str;
		int base, exponent;
		
		for (int i = 0; i < cases; i++) {
			str = in.readLine().split(" ");
			base = Integer.parseInt(str[0]);
			exponent = Integer.parseInt(str[1]);
			
			//base case: power of zero
			if(exponent == 0)
				System.out.println(1);
			else {
				switch (base % 10) {
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
		}
	}
}