import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {


	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int shinigamis = Integer.parseInt(in.readLine());

		PriorityQueue<Point> pq = new PriorityQueue<Point>(shinigamis, new Comparator<Point>() {
			public int compare(Point p1, Point p2) {      
				//Order by weight, then vertex number
				int order = -Integer.compare(p1.x, p2.x);
				if(order == 0) {
					order = Integer.compare(p1.y, p2.y);
				}
				return order;
			}  
		});
		
		for (int i = 1; i <= shinigamis; i++) {
			pq.add(new Point(Integer.parseInt(in.readLine()), i));
		}
		
		while(!pq.isEmpty()) {
			System.out.println(pq.remove().y);
		}

	}

}
