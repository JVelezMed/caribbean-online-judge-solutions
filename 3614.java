import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		String base[] = {
				"zero","one","two","three","four","five","six","seven","eight","nine",
				"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String ones[] = {"","-one","-two","-three","-four","-five","-six","-seven","-eight","-nine"};
		String tens[] = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		
		int cases = Integer.parseInt(in.readLine());
		
		while(cases-- > 0) {
			int num = Integer.parseInt(in.readLine());
			
			if(num >= 0 && num <= 19) {
				System.out.println(base[num]);
			}
			else {
				System.out.println(tens[num/10] + ones[num%10]);
			}
			
		}
	}
}