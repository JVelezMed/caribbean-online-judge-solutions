import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	
    public static void main(String[] args) throws IOException {
        // TODO code application logic here        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tok;
        
        try {
        	int caseNum = 1;
        	while(true) {
        		char input[] = in.readLine().toCharArray();
        		
        		int S = 3*(input[0]-'0' + input[3]-'0' + 
        				input[5]-'0' + input[8]-'0' + 
        				input[10]-'0' + input[12]-'0') +
        			(input[2]-'0' + input[4]-'0'
					 + input[6]-'0' + input[9]-'0'
					 + input[11]-'0');
        		System.out.printf("Case #%d: %d\n", caseNum++, (10-S%10)%10);
        		
        		
        	}
         
		} catch (Exception e) {
			System.exit(0);
		}
        
        
    }
    
}