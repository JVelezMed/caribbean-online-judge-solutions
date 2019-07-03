import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static final boolean VISITED = true;
	public static final int INF = 1000000000;

	public static int dist[];
	public static boolean visited[];
	public static LinkedList<Point> adjList[];

	public static PriorityQueue<Point> pq;
	public static char maze[][][];
	public static int L, R, C;
	public static int src;
	public static int dest;

	public static int tl[] = {0,0,0,0,-1,1};
	public static int tr[] = {-1,0,1,0,0,0};
	public static int tc[] = {0,1,0,-1,0,0};

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		tok = new StringTokenizer(in.readLine());
		L = Integer.parseInt(tok.nextToken());
		R = Integer.parseInt(tok.nextToken());
		C = Integer.parseInt(tok.nextToken());

		while(L!=0 || R!=0 || C!=0) {
			

			//The maze from the input
			maze = new char[L][R][C];
			//The adjacency list
			//1st level: vertex #
			//2nd level: list of edges and weight
			
			adjList = new LinkedList[L*R*C];		

			for (int i = 0; i < L; i++) {
				for (int j = 0; j < R; j++) {
					maze[i][j] = in.readLine().toCharArray();
				}
				in.readLine();	//Ignore line
			}
			
			//Set all distances to infinity
			buildMaze();
			dist = new int[L*R*C];
			for (int i = 0; i < dist.length; i++) {
				dist[i] = INF;
			}
			dist[src] = 0;
			
//			for (int i : dist) {
//				System.out.println(i);
//			}
//			
//			//Print adjacency List
//			for (int i = 0; i < adjList.length; i++) {
//				System.out.print("start:" + i);
//				if(!adjList[i].isEmpty()) {
//					for (Point point : adjList[i]) {
//						System.out.print("->" + point.x);
//					}
//				}
//				System.out.println();
//			}
			
			dijkstra();
			
			System.out.println(dist[dest] == INF ? "Trapped!" : "Escaped in " +dist[dest]+ " minute(s).");

			tok = new StringTokenizer(in.readLine());			
			L = Integer.parseInt(tok.nextToken());
			R = Integer.parseInt(tok.nextToken());
			C = Integer.parseInt(tok.nextToken());
		}


	}

	public static void buildMaze() {
		int position;

		LinkedList<Point> edgeList;

		for (int i = 0; i < L; i++) {
			for (int j = 0; j < R; j++) {
				for (int k = 0; k < C; k++) {
					edgeList = new LinkedList<Point>();

					//Check that I'm in a valid cell
					if(maze[i][j][k] != '#') {
						
						//If I find source or destination, record it
						switch (maze[i][j][k]) {
						case 'S':
							src = i*R*C+j*C+k;
							break;
						case 'E':
							dest = i*R*C+j*C+k;
							break;

						}
						
						//Travel all 6 possible directions
						for (int trav = 0; trav < 6; trav++) {
							//Check if location is valid
							if(	i+tl[trav] >= 0 && i+tl[trav] < L &&
								j+tr[trav] >= 0 && j+tr[trav] < R &&
								k+tc[trav] >= 0 && k+tc[trav] < C &&
								maze[i+tl[trav]][j+tr[trav]][k+tc[trav]] != '#') {
	
								position = (i+tl[trav])*R*C + (j+tr[trav])*C + (k+tc[trav]);

								//System.out.printf("(%c) %d %d %d\n", maze[i][j][k], i, j, k);
								//System.out.printf("(%c) %d %d %d\n", maze[i+tl[trav]][j+tr[trav]][k+tc[trav]]
								//		, i+tl[trav], j+tr[trav], k+tc[trav]);
								//System.out.printf("%d %d %d\n", (i+tl[trav])*R*C, (j+tr[trav])*C, (k+tc[trav]));
								//System.out.println((i*R*C+j*C+k) + " can travel to " + position);
								edgeList.add(new Point(position, 1));
							}
						}	
					}
					adjList[i*R*C+j*C+k] = edgeList;
				}
			}

		}
	}

	public static void dijkstra() {
		pq = new PriorityQueue<Point>(L*R*C, new Comparator<Point>() {
			public int compare(Point p1, Point p2) {      
				//Order by weight, then vertex number
				int order = Integer.compare(p1.x, p2.x);
				if(order == 0) {
					order = Integer.compare(p1.y, p2.y);
				}
				return order;
			}  
		});
		
		//Add source vertex
		pq.add(new Point(0, src));
		
		while(!pq.isEmpty()) {
			Point front = pq.remove();
			int d = front.x, u = front.y;
			if(d > dist[u]) continue;
			for (int i = 0; i < adjList[u].size(); i++) {
				Point v = adjList[u].get(i);
				
				//If the cost less to travel from u to v than the current number
				//in v, update the shortest path
				if(dist[u] + v.y < dist[v.x]) {
					dist[v.x] = dist[u] + v.y;
					pq.add(new Point(dist[v.x], v.x));
				}
			}
		}
		
	}

}