import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int cases = Integer.parseInt(in.readLine());
		int x1, y1, r1, x2, y2, r2; 
		while(cases-- > 0) {
			tok = new StringTokenizer(in.readLine());
			x1 = Integer.parseInt(tok.nextToken());
			y1 = Integer.parseInt(tok.nextToken());
			r1 = Integer.parseInt(tok.nextToken());
			x2 = Integer.parseInt(tok.nextToken());
			y2 = Integer.parseInt(tok.nextToken());
			r2 = Integer.parseInt(tok.nextToken());

			int dist = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
			int add = (r1 + r2)*(r1 + r2);
			int diff = (r1 - r2)*(r1 - r2);

			if(dist == 0 && r1 == r2) {
				System.out.println("SAME");
			}
			else if(dist < diff) {
				System.out.println("INT");
			}
			else if(dist == diff) {
				System.out.println("TANGENT INT");
			}
			else if(diff < dist && dist < add) {
				System.out.println("SEC");
			}
			else if(dist == add) {
				System.out.println("TANGENT EXT");
			}
			else {
				System.out.println("EXT");
			}
		
		}
	}
}