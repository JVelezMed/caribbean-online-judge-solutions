import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int num = Integer.parseInt(in.readLine());
		ArrayList<Integer> rowBits;
		ArrayList<Integer> colBits;

		while(num != 0) {
			rowBits = new ArrayList<Integer>();
			colBits = new ArrayList<Integer>();
			int arr[][] = new int[num][num];

			for (int i = 0; i < num; i++) {
				tok = new StringTokenizer(in.readLine());

				for (int j = 0; j < num; j++) {
					arr[i][j] = Integer.parseInt(tok.nextToken());
				}
			}

			int accum;

			for (int i = 0; i < num; i++) {
				accum = 0;
				for (int j = 0; j < num; j++) {
					accum += arr[i][j];
				}

				if(accum % 2 != 0) {
					rowBits.add(i+1);
				}
			}
			
			for (int i = 0; i < num; i++) {
				accum = 0;
				for (int j = 0; j < num; j++) {
					accum += arr[j][i];
				}

				if(accum % 2 != 0) {
					colBits.add(i+1);
				}
			}
			
			if(rowBits.size() == 0 && colBits.size() == 0) {
				System.out.println("OK");
			}
			else if(rowBits.size() == 1 && colBits.size() == 1)  {
				System.out.printf("Change bit (%d,%d)\n", rowBits.get(0), colBits.get(0));
			}
			else {
				System.out.println("Corrupt");
			}

			num = Integer.parseInt(in.readLine());
		}
	}
}