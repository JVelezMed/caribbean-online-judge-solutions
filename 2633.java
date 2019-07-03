import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static double PI = 3.14159;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;

		int cases = Integer.parseInt(reader.readLine());

		double max = 0;

		while(cases-- > 0)
		{
			
//			Cone: V = (1/3)PI*R^2*H
//					Cylinder: V = PI*R^2*H
//					Sphere: V = (4/3)PI*R^3
			double temp, R, H;
			tok = new StringTokenizer(reader.readLine());

			char letter = tok.nextToken().charAt(0);

			switch (letter) {
			case 'S':
				R = Double.parseDouble(tok.nextToken());
				temp = (4*PI*R*R*R)/3.0;
				max = temp > max ? temp : max; 
				break;

			case 'C':
				R = Double.parseDouble(tok.nextToken());
				H = Double.parseDouble(tok.nextToken());
				temp = (PI*R*R*H)/3.0;
				max = temp > max ? temp : max; 
				break;

			case 'L':
				R = Double.parseDouble(tok.nextToken());
				H = Double.parseDouble(tok.nextToken());
				temp = (PI*R*R*H);
				max = temp > max ? temp : max; 
				break;

			default:
				break;
			}

		}
		
		System.out.printf("%.3f\n", max);
	}
}
