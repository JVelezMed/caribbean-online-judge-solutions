import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] num = in.readLine().split(" ");
		String order = in.readLine();
		int a = Integer.parseInt(num[0]), 
			b = Integer.parseInt(num[1]), 
			c = Integer.parseInt(num[2]);
		
		if(a > b)
			a = a + b - (b = a);
		if(a > c)
			a = a + c - (c = a);
		if(b > c)
			b = b + c - (c = b);
		
		int[] arr = {a, b, c};
		
		System.out.println(arr[order.charAt(0) - 'A'] + " " + 
						   arr[order.charAt(1) - 'A'] + " " + 
						   arr[order.charAt(2) - 'A']);
	}
}