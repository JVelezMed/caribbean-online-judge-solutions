import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	
	public static int lake[][];
	public static int traveled[][];

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer tok = new StringTokenizer(reader.readLine());

		int rows = Integer.parseInt(tok.nextToken());
		int columns = Integer.parseInt(tok.nextToken());

		lake = new int[rows][columns];
		traveled = new int[rows][columns];

		int amount = Integer.parseInt(tok.nextToken());

		int max = 0;
		while(amount-- > 0) {
			tok = new StringTokenizer(reader.readLine());
			int r = Integer.parseInt(tok.nextToken());
			int c = Integer.parseInt(tok.nextToken());

			lake[r-1][c-1] = 1;
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if(lake[i][j] == 1 && traveled[i][j] == 0) {
					int tempMax = floodfill(i, j, rows, columns);
					max = tempMax > max ? tempMax : max;
				}
			}
		}
		
		System.out.println(max);

	}

	public static int floodfill(int i, int j, int r, int c) {
		// TODO Auto-generated method stub
		if(i < 0 || i >= r || j < 0 || j >= c || traveled[i][j] == 1) {
			return 0;
		}
		else {
			if(lake[i][j] == 1)
			{
			traveled[i][j] = 1;
			return 1 + floodfill(i+1, j, r, c)
					 + floodfill(i-1, j, r, c)
					 + floodfill(i, j+1, r, c)
					 + floodfill(i, j-1, r, c);
			}
			else {
				return 0;
			}
		}
	}

}