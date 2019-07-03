import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int numOfGrids = Integer.parseInt(in.readLine());
		String[] rowColumn;
		for (int i = 0; i < numOfGrids; i++) {
			rowColumn = in.readLine().split(" ");
			int row = Integer.parseInt(rowColumn[0]);
			int column = Integer.parseInt(rowColumn[1]);
			
			if (row == 1 && column >= 1) 
				System.out.println("R");
			else if(row >= 1 && column == 1)
				System.out.println("D");
			else if(row == column)
				System.out.println((row % 2 == 0 ? "L" : "R"));
			else if(row % 2 == 0 && column % 2 == 0)
				System.out.println((row < column ? "L" : "U"));
			else if(row % 2 != 0 && column % 2 != 0)
				System.out.println((row < column ? "R" : "D"));	
			else if(row % 2 == 0 && column % 2 != 0) 
				System.out.println((row < column ? "L" : "D"));
			else if(row % 2 != 0 && column % 2 == 0)
				System.out.println((row < column ? "R" : "U"));
				
		}
	}
}