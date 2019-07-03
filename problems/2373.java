import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int A, B, C, D;
		int rot;
		double max;

		tok = new StringTokenizer(in.readLine());
		A = Integer.parseInt(tok.nextToken());
		B = Integer.parseInt(tok.nextToken());
		
		tok = new StringTokenizer(in.readLine());
		C = Integer.parseInt(tok.nextToken());
		D = Integer.parseInt(tok.nextToken());

		max = 1.0*A/B + 1.0*C/D;
		rot = 0;

		//A B
		//C D
		
		if(1.0*C/A + 1.0*D/B > max) {
			max = 1.0*C/A + 1.0*D/B;
			rot = 1;
		}

		if(1.0*D/C + 1.0*B/A > max) {
			max = 1.0*D/C + 1.0*B/A;
			rot = 2;
		}
		
		if(1.0*B/D + 1.0*A/C > max) {
			max = 1.0*B/D + 1.0*A/C;
			rot = 3;
		}
		
		System.out.println(rot);

	}

}