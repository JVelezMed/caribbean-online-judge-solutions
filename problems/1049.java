import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int num, total;
		
		while((line = reader.readLine()) != null){
			num = Integer.parseInt(line);
			total = num >= 0 ? num * (num + 1) / 2 : -(-num * (-num + 1) / 2) + 1;
			System.out.println(total);
		}
	}
}
