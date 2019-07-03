import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uCalculateE {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());
		for (int i = 0; i < cases; i++) {
			byte landSize = Byte.parseByte(in.readLine());
			char[][] area = new char[landSize][landSize];

			//Read the values of the grid
			for (byte j = 0; j < landSize; j++) {
				String caract = in.readLine();
				for (byte k = 0; k < landSize; k++) {
					area[j][k] = caract.charAt(k);
				}
			}
			
			byte biggestHouseSize = 0;
			
			for (byte a = 0; a < landSize; a++) {
				for (byte b = 0; b < landSize; b++) {
					boolean flag = true;
					
					//Check for 2x2, then 3x3, etc.
					int tempPlotSize = 2;
					byte tempHouseSize = 0;
					
					//Fences interfere
					if (area[a][b] == '#') {
						flag = false;
					} else {
						tempHouseSize = 1;
					}

					while (flag) {
						for (byte c = 0; c < tempPlotSize && flag; c++) {
							for (byte d = 0; d < tempPlotSize; d++) {
								//Index out of bounds means I'm done
								if (a + c == landSize || b + d == landSize) {
									flag = false;
									break;
								} else {
									//Fence interferes
									if (area[a + c][b + d] == '#') {
										flag = false;
										break;
									}
								}
							}
						}
						if (flag) {
							tempPlotSize++;
							tempHouseSize++;
						}
					}
					if (tempHouseSize > biggestHouseSize) {
						biggestHouseSize = tempHouseSize;
					}
				}
			}
			System.out.println(biggestHouseSize);
		}
	}
}