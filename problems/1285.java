import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class Main {
		
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int points = Integer.parseInt(in.readLine());
		int a, b;
		Point standings[] = new Point[points];
		for (int i = 0; i < points; i++) {
			tok = new StringTokenizer(in.readLine());
			standings[i] = new Point(Integer.parseInt(tok.nextToken()), Integer.parseInt(tok.nextToken()));
		}
		
		Arrays.sort(standings, new Comparator<Point>() {
			public int compare(Point a, Point b) {
				return -Integer.compare(a.y, b.y);
			}
		});
		
		for (int i = 0; i < points; i++) {
			System.out.println(standings[i].x + " " + standings[i].y);
		}
	}
}