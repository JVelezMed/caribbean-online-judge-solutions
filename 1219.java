import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine()); 
		PriorityQueue<Integer> jobList;
		
		while(cases-- > 0) {
			StringTokenizer tok = new StringTokenizer(in.readLine());
			int bullets = Integer.parseInt(tok.nextToken());
			int jobs = Integer.parseInt(tok.nextToken());
			int rewardsTotal = 0;
			jobList = new PriorityQueue<Integer>();
			//Read the job details
			while(jobs-- > 0) {
				tok = new StringTokenizer(in.readLine());
				int reward = Integer.parseInt(tok.nextToken());
				jobList.add(-reward);
			}
			
			//Start racking up the rewards
			while(bullets > 0 && !jobList.isEmpty()) {
				rewardsTotal += (-jobList.remove());
				bullets--;
			}
			
			System.out.println(rewardsTotal);
		}

	}
}