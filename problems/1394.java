import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger number;
	    number = new BigInteger(in.readLine().trim());
	    BigInteger two = BigInteger.valueOf(2);
	    
	    boolean first = true;
	    
	    while(!number.equals(BigInteger.valueOf(-1))) {
	        if(number.mod(two).equals(BigInteger.ZERO)) {
	            if(first) {
	                first = false;
	                System.out.printf("f(%d) = %d\n", number, number.divide(two));
	            }
	            else {
	            	System.out.printf("\nf(%d) = %d\n", number, number.divide(two));
	            }
	        }
	        else {
	            if(first) {
	                first = false;
	                System.out.printf("f(%d) = %d\n", number, number.add(BigInteger.ONE).divide(two));
	            }
	            else {
	            	System.out.printf("\nf(%d) = %d\n", number, number.add(BigInteger.ONE).divide(two));
	            }
	        }
	        number = new BigInteger(in.readLine().trim());
	    }
	}
}