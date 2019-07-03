import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] dimensions;
		int input = Integer.parseInt(reader.readLine());
		int length, height;
		while(input != -1) {
			switch(input) {
			//triangle
			case 1:
				height = Integer.parseInt(reader.readLine());
				for (int i = 1; i <= height; i++) {
					System.out.println(getNCharacter(" ", height - i) + 
							getNCharacter("*", 2*i-1));
				}
				System.out.println();
				break;

				//parallelogram
			case 2:
				dimensions = reader.readLine().split(" ");
				length = Integer.parseInt(dimensions[0]);
				height = Integer.parseInt(dimensions[1]);
				for (int i = 1; i <= height; i++) {
					System.out.println(getNCharacter(" ", height - i) + 
							getNCharacter("*", length));
				}
				System.out.println();
				break;

				//rectangle
			case 3:
				dimensions = reader.readLine().split(" ");
				length = Integer.parseInt(dimensions[0]);
				height = Integer.parseInt(dimensions[1]);
				for (int i = 1; i <= height; i++) {
					System.out.println(getNCharacter("*", length));
				}
				System.out.println();
				break;

			}
			input = Integer.parseInt(reader.readLine());
		}
	}

	private static String getNCharacter(String character, int times) {
		String result = "";
		for (int i = 1; i <= times; i++) {
			result += character;
		}
		return result;
	}
}