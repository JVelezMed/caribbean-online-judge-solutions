import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {
   
	private static final Pattern IPV4 = Pattern.compile(
            "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
	private static final Pattern IPV6 = Pattern.compile(
            "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){5}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
	
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tok;
        
        int cases = Integer.parseInt(in.readLine());
        while(cases-- > 0) {
        	//Regex this sucker
            System.out.println(validate(in.readLine()) ? "SI" : "NO");        	
        }
        
    }
    
    public static boolean validate(String ip) {
        return IPV4.matcher(ip).matches() || IPV6.matcher(ip).matches();
    }
}