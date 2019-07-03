import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Edge
{
	int r;
	int c;
	int w;
	
	public Edge(int r, int c, int w) {
		this.r = r;
		this.c = c;
		this.w = w;
	}
}

public class Main {

	public static final int INFINITY = 1000000000;
	
	public static int tr[] = {-1,0,1,0};
	public static int tc[] = {0,1,0,-1};
	
	public static char maze[][];
	public static int costs[][];
	
	public static Point src, dest;
	public static int size;
	
	public static void main(String[] args) throws IOException {
		// TODO code application logic here        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		size = Integer.parseInt(in.readLine());
		
		maze = new char[size][size];
		costs = new int[size][size];
		
		for (int i = 0; i < size; i++) {
			String line = in.readLine();
			for (int j = 0; j < size; j++) {
				maze[i][j] = line.charAt(j);
				if(maze[i][j] == 'm') {
					src = new Point(i, j);
				}
				if(maze[i][j] == '#') {
					dest = new Point(i, j);
				}
			}
		}
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				costs[i][j] = INFINITY;
			}
		}
		costs[src.x][src.y] = 0;	//Source has no cost
		
		dijkstra();
		
		System.out.println(costs[dest.x][dest.y] != INFINITY ? costs[dest.x][dest.y] : -1);
	}
	
	public static void dijkstra() {
	PriorityQueue<Edge> pq = new PriorityQueue<Edge>(size*size, new Comparator<Edge>() {
		public int compare(Edge e1, Edge e2) {      
			return Integer.compare(e1.w, e2.w);
		}  
	});
	
	//Add source vertex
	pq.add(new Edge(src.x, src.y, 0));
	
	while(!pq.isEmpty()) {
		Edge front = pq.remove();
		int d = front.w, r = front.r, c = front.c;
		if(d > costs[r][c]) continue;
		for (int i = 0; i < 4; i++) {
			//Check travel is valid
			if(r+tr[i] >= 0 && r+tr[i] < size &&
					c+tc[i] >= 0 && c+tc[i] < size &&
					maze[r+tr[i]][c+tc[i]] != '*') {
				Point loc = new Point(r+tr[i], c+tc[i]);
				
				//If the cost less to travel from current location (r/c) to new
				//location (loc.x/loc.y) than the current number r/c, update theshortest path
				if(costs[r][c] + 1 < costs[loc.x][loc.y]) {
					costs[loc.x][loc.y] = costs[r][c] + 1;
					pq.add(new Edge(loc.x, loc.y, costs[loc.x][loc.y]));
				}
			}
			
			
		}
	}
	
}

}