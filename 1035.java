import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[] nums = new int[1000001];
		nums[0] = 1;
		
		for (int i = 1; i < nums.length; i++) {
			nums[i] = (nums[(int)(i - Math.sqrt(i))] + 
					  nums[(int)(Math.log(i))] + 
					  nums[(int)(i * Math.sin(i) * Math.sin(i))]) % 1000000;
		}
		
		int num = Integer.parseInt(in.readLine());
		while(num != -1) {
			System.out.println(nums[num]);
			num = Integer.parseInt(in.readLine());
		}
	}
}