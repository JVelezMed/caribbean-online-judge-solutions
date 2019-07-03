import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;
		
		int array[] = new int[5];
		int array2[] = new int[5];

		tok = new StringTokenizer(reader.readLine());
		for (int i = 0; i < 5; i++) {
			array[i] = Integer.parseInt(tok.nextToken());
		}
		
		tok = new StringTokenizer(reader.readLine());
		for (int i = 0; i < 5; i++) {
			array2[i] = Integer.parseInt(tok.nextToken());
		}
		
		boolean good = true;
		
		for (int i = 0; i < 5; i++) {
			if((array[i] ^ array2[i]) == 0) {
				good = false;
			}
		}
		
		System.out.println(good ? "Y" : "N");
		
	}

}
