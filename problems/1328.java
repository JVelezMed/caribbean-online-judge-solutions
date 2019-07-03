import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());

		for (int i = 0; i < cases; i++) {
			int children = Integer.parseInt(in.readLine());
			int compositeScores[] = new int[children];

			//Math scores first
			for (int j = 0; j < children; j++) {
				compositeScores[j] += Integer.parseInt(in.readLine());
			}

			//The sum of all scores
			int sum = 0;
			//Fisic scores
			for (int j = 0; j < children; j++) {
				compositeScores[j] += Integer.parseInt(in.readLine());
				sum += compositeScores[j];
			}
			
			double average = sum / (double)children;
			int below = 0;
			
			for (int j = 0; j < children; j++) {
				if(compositeScores[j] < average) {
					below++;
				}
			}
			
			System.out.println(below);
		}
	}
}