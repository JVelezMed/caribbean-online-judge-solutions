import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class uCalculateE
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		in.readLine();
		String infixBuffer = in.readLine();
		String postfixBuffer = InfixToPostfixConvert(infixBuffer);
		//System.out.println(postfixBuffer);

		StringTokenizer tok = new StringTokenizer(postfixBuffer.trim());
		Stack<Integer> numbers = new Stack<Integer>();

		while (tok.hasMoreTokens()) {
			String word = tok.nextToken();
			char ch = word.charAt(0);

			if (ch == '+' || ch == '*') {
				int num2 = numbers.pop();
				int num1 = numbers.pop();

				if(ch == '+') {
					numbers.push(num1 + num2);
				}
				else if(ch == '*') {
					numbers.push(num1 * num2);
				}
			}
			else {
				int sum = 0;
				for (int i = 0; i < word.length(); i++) {
					switch (word.charAt(i)) {
					case '.':
						sum += 1;
						break;
					case ':':
						sum += 2;
						break;
					case '-':
						sum += 5;
						break;
					case '=':
						sum += 10;
						break;

					default:
						break;
					}
				}
				numbers.push(sum);
			}
		}

		System.out.println(numbers.pop());
	}

	public static String InfixToPostfixConvert(String infixBuffer)
	{
		int priority = 0;
		String postfixBuffer = "";

		Stack<Character> s1 = new Stack<Character>();

		StringTokenizer tok = new StringTokenizer(infixBuffer);

		while(tok.hasMoreTokens()) {
			String word = tok.nextToken();
			//System.out.println("Buffer: " + postfixBuffer);
			//System.out.println(word);
			//System.out.println("Stack: " + s1);

			char ch = word.charAt(0);
			if (ch == '+' || ch == '*')
			{
				//Empty? Just push the operator
				if (s1.size() == 0) {
					s1.push(ch);
				}
				else	
				{
					//Check the precedence
					Character chTop = (Character) s1.peek();
					priority = (chTop == '*') ? 1 : 0;

					if (priority == 1)
					{
						if (ch == '+')
						{
							postfixBuffer += s1.pop() + " ";
							while(!s1.isEmpty()) {
								postfixBuffer += s1.pop() + " ";
							}
							s1.push(ch);
						}
						else
						{ // Same
							s1.push(ch);
						}
					}
					else
					{
						if (ch == '+')
						{
							//postfixBuffer += s1.pop() + " ";
							s1.push(ch);
						}
						else
							s1.push(ch);
					}
				}
			}
			else
			{
				//System.out.println("NUMBER!");
				postfixBuffer += word + " ";
			}
		}

		while(!s1.isEmpty()) {
			postfixBuffer += s1.pop() + " ";
		}
		return postfixBuffer;
	}
}