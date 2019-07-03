import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());
		String[] candReg;
		int[] candidates;
		int winner;

		for (int i = 0; i < cases; i++) {
			winner = 0;
			candReg = in.readLine().split(" ");
			candidates = new int[Integer.parseInt(candReg[0])];
			
			for (int j = 0; j < Integer.parseInt(candReg[1]); j++) {
				String[] temp = in.readLine().split(" ");
				for (int k = 0; k < candidates.length; k++) {
					candidates[k] += Integer.parseInt(temp[k]);
				}
			}
			
			for (int j = 0; j < candidates.length; j++) {
				if(candidates[j] > candidates[winner])
					winner = j;
			}
			System.out.println(winner + 1);
		}
	}
}