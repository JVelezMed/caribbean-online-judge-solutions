import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;
		int lectures, accum;
		try {
			while(true) {
				lectures = Integer.parseInt(in.readLine());
				accum = 0;
				int t1, t2;
				
				for (int i = 0; i < lectures; i++) {
					tok = new StringTokenizer(in.readLine());
					
					t1 = Integer.parseInt(tok.nextToken())*60 + Integer.parseInt(tok.nextToken());
					t2 = Integer.parseInt(tok.nextToken())*60 + Integer.parseInt(tok.nextToken());
					
					accum += t2 < t1 ? 0 : t2 - t1;
				}
				
				System.out.println(accum / lectures);
			}
			
		} catch (Exception e) {
			System.exit(0);
		}
		

	}

}