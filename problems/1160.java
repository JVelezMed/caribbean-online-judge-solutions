import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());
		for (int i = 0; i < cases; i++) {
			String[] nums = in.readLine().split(" ");
			int x = Integer.parseInt(nums[0]);
			int y = Integer.parseInt(nums[1]);
			if(x == 0 && y == 0)
				System.out.println(0);
			else if( (x == y && x % 2 != 0) || (y + 2 == x && y % 2 != 0))
				System.out.println(x + y - 1);
			else if( (x == y && x % 2 == 0) || (y + 2 == x && y % 2 == 0))
				System.out.println(x + y);
			else
				System.out.println("No Number");
		}
	}
}