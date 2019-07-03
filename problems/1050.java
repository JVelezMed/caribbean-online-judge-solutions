import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		int count = 0;
		for (int i = 1; i < num; i++) {
			if(gcd(num,i) == 1)
				count++;
		}
		System.out.println(count);
		
	}

	private static int gcd(int a, int b) {
		if(b == 0)
			return a;
		else
			return gcd(b, a % b);
		
	}
}
