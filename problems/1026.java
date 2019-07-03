import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static int r, c, longest;
	public static int map[][];
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;
		
		int cases = Integer.parseInt(reader.readLine());
		String name;
		while(cases-- > 0) {
			longest = 1;
			
			tok = new StringTokenizer(reader.readLine());
			
			name = tok.nextToken();
			r = Integer.parseInt(tok.nextToken());
			c = Integer.parseInt(tok.nextToken());
			map = new int[r][c];
			
			for (int i = 0; i < r; i++) {
				tok = new StringTokenizer(reader.readLine());
				for (int j = 0; j < c; j++) {
					map[i][j] = Integer.parseInt(tok.nextToken());
				}
			}
			
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					slideDown(i, j, map[i][j], 1);
				}
			}
			
			System.out.printf("%s: %d\n", name, longest);
		}
	}

	private static void slideDown(int i, int j, int current, int distance) {
		if(i >= 0 && i < r && j >= 0 && j < c) 
		{
			if(distance > longest)
			{
				longest = distance;
			}
			
			if(i > 0 && map[i-1][j] < current) {
				slideDown(i-1, j, map[i-1][j], distance+1);
			}
			
			if(i < r-1 && map[i+1][j] < current) {
				slideDown(i+1, j, map[i+1][j], distance+1);
			}
			
			if(j > 0 && map[i][j-1] < current) {
				slideDown(i, j-1, map[i][j-1], distance+1);
			}
			
			if(j < c-1 && map[i][j+1] < current) {
				slideDown(i, j+1, map[i][j+1], distance+1);
			}
		}
		
	}
}