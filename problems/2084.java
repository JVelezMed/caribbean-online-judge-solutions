import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static int count, small, large, size;
	public static char map[][];
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		size = Integer.parseInt(reader.readLine());
		
		while(size != 0) {
			map = new char[size][size];
			small = size*size+1;
			large = 0;
			count = 0;
			
			for (int i = 0; i < size; i++) {
				map[i] = reader.readLine().toCharArray();
			}
			
			int temp;
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if(map[i][j] == 'l') {
						++count;	//new island
						temp = floodFill(i, j);
						small = temp < small ? temp : small;
						large = temp > large ? temp : large;
					}
				}
			}
			
			if(count == 0) {
				System.out.println("0 0 0");
			}
			else {
				System.out.printf("%d %d %d\n", count, small, large);
			}
			
			size = Integer.parseInt(reader.readLine());
		}
	}
	private static int floodFill(int i, int j) {
		
		if(i >= 0 && i < size && j >= 0 && j < size && map[i][j] == 'l') {
			map[i][j] = 't';
			return 1 + floodFill(i+1, j-1) + floodFill(i+1, j) + floodFill(i+1, j+1) + floodFill(i, j+1)
					 + floodFill(i-1, j-1) + floodFill(i-1, j) + floodFill(i-1, j+1) + floodFill(i, j-1);
		}
		else {
			return 0;
		}
	}
}