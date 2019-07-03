import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		String[] clockT;
		
		while(!str.equals("0 0 0 0")) {
			 clockT = str.split(" ");
			 int H1 = Integer.parseInt(clockT[0]), M1 = Integer.parseInt(clockT[1]),
				 H2 = Integer.parseInt(clockT[2]), M2 = Integer.parseInt(clockT[3]);
			 
			 if(H1 < H2)
				System.out.println((H2 * 60 + M2) - (H1 * 60 + M1));
			 
			 else if(H1 > H2)
				 if(M1 <= M2)
					 System.out.println((24 - H1 + H2) * 60 + (M2 - M1));
				 else
					 System.out.println((23 - H1 + H2) * 60 + (60 - (M1 - M2)));
			 else 
				 if(M1 <= M2)
					 System.out.println(M2 - M1);
				 else
					 System.out.println(1440 - (M1 - M2));
			 str = in.readLine();
		}
	}
}