import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
	
	public static long precalc[] = new long[10];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int nums = Integer.parseInt(reader.readLine());
		int array[];
		while(nums > 0) {
			array = new int[nums];
			tok = new StringTokenizer(reader.readLine());
			for (int i = 0; i < array.length; i++) {
				array[i] = Integer.parseInt(tok.nextToken());
			}
			//Remember to sort the array before getting the median!
			Arrays.sort(array);
			
			int length = array.length;
			if(length % 2 == 0) {
				System.out.printf("%.1f\n", (array[length/2] + array[length/2 - 1])/2.0);
			}
			else {
				System.out.printf("%.1f\n", 1.0*array[length/2]);
			}
			
			nums = Integer.parseInt(reader.readLine());
		}
			
		
	}
}