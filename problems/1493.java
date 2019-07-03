import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat fff = new DecimalFormat("0.00");
		final double PI = 3.14;
		String[] str = in.readLine().split(" ");
		
		if(str[0].equals("circle")) 
			System.out.println(fff.format(PI * Double.parseDouble(str[1]) * Double.parseDouble(str[1])) );
		else if(str[0].equals("triangle"))
			System.out.println(fff.format(Double.parseDouble(str[1]) * Double.parseDouble(str[2]) / 2.0));
		else if(str[0].equals("rhombus"))
			System.out.println(fff.format(Double.parseDouble(str[1]) * Double.parseDouble(str[2]) / 2.0));
	}
}