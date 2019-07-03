import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());
		String num, answer;
		
		for (int i = 0; i < cases; i++) {
			num = Integer.toBinaryString(Integer.parseInt(in.readLine()));
			answer = "";
			for (int j = num.length() - 1; j >= 0; j--) {
				if(num.charAt(j) == '1')
					answer += ((num.length() - j - 1) + " ");
			}
			System.out.println(answer.trim());
		}	
	}
}