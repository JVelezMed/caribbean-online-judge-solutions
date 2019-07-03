import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok =  new StringTokenizer(reader.readLine(), " ");
		System.out.println(Integer.parseInt(tok.nextToken()) + Integer.parseInt(tok.nextToken()));
	}

}
