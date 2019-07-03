import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uCalculateE {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());

		//TTT, TTH, THT, THH, HTT, HTH, HHT and HHH
		int coinCount[];
		//The word to be read
		StringBuilder word;
		//The cases
		for (int i = 0; i < cases; i++) {
			int datasetNum = Integer.parseInt(in.readLine());
			word = new StringBuilder(in.readLine());
			coinCount = new int[]{0, 0, 0, 0, 0, 0, 0, 0};

			int length = word.length();
			for (int j = 0; j < length-2; j++) {
				String substring = word.substring(j, j+3);
				
				//System.out.println(substring);
				if(substring.equals("TTT")) {
					++coinCount[0];
				}
				else if(substring.equals("TTH")) {
					++coinCount[1];
				}
				else if(substring.equals("THT")) {
					++coinCount[2];
				}
				else if(substring.equals("THH")) {
					++coinCount[3];
				}
				else if(substring.equals("HTT")) {
					++coinCount[4];
				}
				else if(substring.equals("HTH")) {
					++coinCount[5];
				}
				else if(substring.equals("HHT")) {
					++coinCount[6];
				}
				else if(substring.equals("HHH")) {
					++coinCount[7];
				}
			}
			System.out.printf("%d %d %d %d %d %d %d %d %d\n", datasetNum, coinCount[0], coinCount[1], coinCount[2], coinCount[3],
					coinCount[4], coinCount[5], coinCount[6], coinCount[7]);
		}
	}
}