import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		int[] nums = {1, 2, 6, 24, 120};
		int sum;
		
		while(!str.equals("0")) {
			sum = 0;
			for (int i = 0; i < str.length(); i++) {
				sum += Integer.parseInt(String.valueOf(str.charAt(i))) * (nums[str.length() - i - 1]);
			}
			System.out.println(sum);
			str = in.readLine();
		}
	}
}