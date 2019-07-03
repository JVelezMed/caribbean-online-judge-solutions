import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		tok = new StringTokenizer(in.readLine());

		int N, K, R, C;
		N = Integer.parseInt(tok.nextToken());
		K = Integer.parseInt(tok.nextToken());
		R = Integer.parseInt(tok.nextToken()) - 1;
		C = Integer.parseInt(tok.nextToken()) - 1;

		//Which rotation am I in?
		//0 = 0, 1 = 90, 2 = 180, 3 = 270
		int rotation = K >= 0 ? K % 4 : ((K % 4) + 4) % 4;

		long row = 0, col = 0;
		switch (rotation) {
		case 0:
			row = R;
			col = C;
			break;
		case 1:
			row = N-C-1;
			col = R;
			break;
		case 2:
			row = N-R-1;
			col = N-C-1;
			break;
		case 3:
			row = C;
			col = N-R-1;
			break;
		}

		System.out.println(N*row + col + 1);

	}

}