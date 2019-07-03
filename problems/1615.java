import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static int digitCount[][];
	
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
    	generate();
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tok;
        
        String input = in.readLine();
        int a, b, caseNum = 1;
        while(!input.equals("0")) {
        	tok = new StringTokenizer(input);
        	a = Integer.parseInt(tok.nextToken());
        	b = Integer.parseInt(tok.nextToken());
        	
        	if(a > b) {
        		int temp = a;
        		a = b;
        		b = temp;
        	}
        	
        	System.out.printf("Case %d:", caseNum++);
        	for (int i = 0; i <= 9; i++) {
				System.out.printf(" %d:%d", i, digitCount[b][i]-digitCount[a-1][i]);
			}
        	System.out.println();
        	
        	input = in.readLine();
        }
        
    }
    
    public static void generate() {
    	digitCount = new int[1000][10];
    	
    	for (int i = 1; i <= 999; i++) {
			int num = i;
			while(num > 0) {
				digitCount[i][num % 10]++;
				num /= 10;
			}
			
			for (int j = 0; j <= 9; j++) {
				digitCount[i][j] += digitCount[i-1][j];
			}
		}
    	
    }
}