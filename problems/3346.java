import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class K {

	public static void main(String[] args) throws IOException {
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(kb.readLine());
		int bell = Integer.parseInt(tk.nextToken());
		int budget = Integer.parseInt(tk.nextToken());
		tk = new StringTokenizer(kb.readLine());
		int[] vols = new int[bell];
		for (int i = 0; i < vols.length; i++) 
			vols[i] = Integer.parseInt(tk.nextToken());
		tk = new StringTokenizer(kb.readLine());
		int sells = Integer.parseInt(tk.nextToken());
		tk = new StringTokenizer(kb.readLine());
		for (int i = 0; i < sells; i++) {
			int ct = 0;
			int price = Integer.parseInt(tk.nextToken());
			int amount = budget/price;
			for (int j = 0; j < vols.length; j++) 
				if(vols[j] > amount)
					ct++;
			System.out.println(ct);
		}
		kb.close();
	}

}