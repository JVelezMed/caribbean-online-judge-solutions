import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	
	public static char array[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;
		
		
		String input = in.readLine();
		
		array = input.toCharArray();
		
		if(nextPermutation()) {
			System.out.println(array);
		}
		else {
			System.out.println(0);
		}
		
	}
	
	public static boolean nextPermutation() {
		// Find non-increasing suffix
		int i = array.length - 1;
		while (i > 0 && array[i - 1] >= array[i])
			i--;
		if (i <= 0)
			return false;
		
		// Find successor to pivot
		int j = array.length - 1;
		while (array[j] <= array[i - 1])
			j--;
		char temp = array[i - 1];
		array[i - 1] = array[j];
		array[j] = temp;
		
		// Reverse suffix
		j = array.length - 1;
		while (i < j) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		return true;
	}
	
	public static boolean prevPermutation() {
		// Find non-increasing suffix
		int i = array.length - 1;
		while (i > 0 && array[i - 1] <= array[i])
			i--;
		if (i <= 0)
			return false;
		
		// Find successor to pivot
		int j = array.length - 1;
		while (array[j] >= array[i - 1])
			j--;
		char temp = array[i - 1];
		array[i - 1] = array[j];
		array[j] = temp;
		
		// Reverse suffix
		j = array.length - 1;
		while (i < j) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		return true;
	}
	
}