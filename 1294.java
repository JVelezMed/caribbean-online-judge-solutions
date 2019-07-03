import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;
		// TODO Auto-generated method stub
		HashSet<Integer> originalSet, userSet;
		
		while(true) {
			try {
				tok = new StringTokenizer(in.readLine());
				int jumpers = Integer.parseInt(tok.nextToken());
				
				if(jumpers == 1) {
					System.out.println("Jolly");
				}
				else {
					//Initialize the original set
					originalSet = new HashSet<Integer>();
					for (int i = 1; i < jumpers; i++) {
						originalSet.add(i);
					}
					
					//Get the user set
					userSet = new HashSet<Integer>();
					int first = Integer.parseInt(tok.nextToken()), second;
					while(tok.hasMoreElements()) {
						second = Integer.parseInt(tok.nextToken());
						userSet.add(Math.abs(first-second));
						first = second;
					}
					
					System.out.println(userSet.equals(originalSet) ? "Jolly" : "Not jolly");
					//System.out.println(originalSet);
					//System.out.println(userSet);
				}
			} catch (Exception e) {
				System.exit(0);
			}
		}
	}

}
