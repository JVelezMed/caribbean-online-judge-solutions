import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cows = Integer.parseInt(br.readLine()), x, y;
		int[] arr = new int[cows];
		for (x = 0; x < cows; x++)
			arr[x] = Integer.parseInt(br.readLine());
		boolean found;
		for(x=0;x<cows;x++){
			found = false;
			for(y=x;y<cows;y++){
				if(arr[y] > arr[x]){
					System.out.println(y+1);
					found = true;
					break;
				}
			}
			if(!found)
				System.out.println(0);
		}
		br.close();
	}
}