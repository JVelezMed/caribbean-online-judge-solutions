import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		
		String line;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(!(line = in.readLine().trim()).equals("0")) {
			String[] nums = line.split(" ");
			int a = Integer.parseInt(nums[0].trim());
			int b = Integer.parseInt(nums[1].trim());
			int c = Integer.parseInt(nums[2].trim());
			
			if (a > b)
				a = a + b - (b = a);
			if(b > c)
				b = b + c - (c = b);
			if(a*a + b*b == c*c)
				System.out.println("right");
			else
				System.out.println("wrong");

		}
		
	}
}
