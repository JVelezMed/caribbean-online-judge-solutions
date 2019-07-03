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
		
		for (int i = 1; i <= cases; i++) {
			String input = in.readLine();
			int fullHour[] = new int[6];
			int index = 0;
			
			//First digit of hour
			int flag = 1;
			while(flag != -1) {
				if(input.charAt(index) == '(') {
					if(input.charAt(index+1) == '*') {
						fullHour[0] += Math.pow(2, flag);
						index += 3;
					}
					else {
						index += 2;
					}
					flag--;
				}
				else {
					flag--;
					index++;
				}
			}
			
			//Second digit of hour
			flag = 3;
			while(flag != -1) {
				if(input.charAt(index) == '(') {
					if(input.charAt(index+1) == '*') {
						fullHour[1] += Math.pow(2, flag);
						index += 3;
					}
					else {
						index += 2;
					}
					flag--;
				}
				else {
					flag--;
					index++;
				}
			}
			
			//First digit of minute
			flag = 2;
			while(flag != -1) {
				if(input.charAt(index) == '(') {
					if(input.charAt(index+1) == '*') {
						fullHour[2] += Math.pow(2, flag);
						index += 3;
					}
					else {
						index += 2;
					}
					flag--;
				}
				else {
					flag--;
					index++;
				}
			}
			
			//Second digit of minute
			flag = 3;
			while(flag != -1) {
				if(input.charAt(index) == '(') {
					if(input.charAt(index+1) == '*') {
						fullHour[3] += Math.pow(2, flag);
						index += 3;
					}
					else {
						index += 2;
					}
					flag--;
				}
				else {
					flag--;
					index++;
				}
			}
			
			//First digit of second
			flag = 2;
			while(flag != -1) {
				if(input.charAt(index) == '(') {
					if(input.charAt(index+1) == '*') {
						fullHour[4] += Math.pow(2, flag);
						index += 3;
					}
					else {
						index += 2;
					}
					flag--;
				}
				else {
					flag--;
					index++;
				}
			}
			
			//Second digit of second
			flag = 3;
			while(flag != -1) {
				if(input.charAt(index) == '(') {
					if(input.charAt(index+1) == '*') {
						fullHour[5] += Math.pow(2, flag);
						index += 3;
					}
					else {
						index += 2;
					}
					flag--;
				}
				else {
					flag--;
					index++;
				}
			}
			
			//Show answer
			System.out.println("Case " + i + ": " + fullHour[0] + "" + fullHour[1] + ":" +
							   fullHour[2] + "" + fullHour[3] + ":" +
							   fullHour[4] + "" + fullHour[5]);
			
		}
	}
}
