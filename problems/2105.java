import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;
		
		int rows, columns;
		
		tok = new StringTokenizer(reader.readLine());
		
		rows = Integer.parseInt(tok.nextToken());
		columns = Integer.parseInt(tok.nextToken());
		char map[][] = new char[rows][columns];
		
		for (int i = 0; i < rows; i++) {
			map[i] = reader.readLine().toCharArray();
		}
		
		int coastCells = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if(map[i][j] == '+' && (i == 0 || j == 0 || i == rows-1 || j==columns-1 ||
						map[i-1][j] == '-' || map[i+1][j] == '-' || map[i][j-1] == '-' || map[i][j+1] == '-')) 
				{
					++coastCells;
				}
			}
		}
		
		System.out.println(coastCells);
	}
}