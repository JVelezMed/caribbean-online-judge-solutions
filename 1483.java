import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] str = in.readLine().split(" ");
		
		if(str[0].equals("square"))
			System.out.println(Integer.parseInt(str[1]) * Integer.parseInt(str[1]));
		else if(str[0].equals("rectangle"))
			System.out.println(Integer.parseInt(str[1]) * Integer.parseInt(str[2]));	
	}
}