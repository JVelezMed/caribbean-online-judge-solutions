import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());
		
		Stack<String> stack;
		LinkedList<String> list;
		PriorityQueue<Integer> priorityQueue;
		
		StringTokenizer tokenizer;
		String input;
		//go through all cases
		for (int i = 1; i <= cases; i++) {
			//Read input
			input = in.readLine();
			
			//To keep reference to the token
			String token;
			int answer;
			
			
			//Tokenizer for stack
			tokenizer = new StringTokenizer(input, " ");
			//create new stack
			stack = new Stack<String>();
			while(tokenizer.hasMoreTokens()) {
				token = tokenizer.nextToken();
				if(isDigit(token.charAt(0))) {
					stack.add(token);
				}
				else {
					answer = performOperation(token.charAt(0), 
							Integer.parseInt(stack.pop()), 
							Integer.parseInt(stack.pop()));
					stack.push(String.valueOf(answer));
				}	
			}
			
			//Tokenizer for queue
			tokenizer = new StringTokenizer(input, " ");
			//create new queue
			list = new LinkedList<String>();
			while(tokenizer.hasMoreTokens()) {
				token = tokenizer.nextToken();
				if(isDigit(token.charAt(0))) {
					list.add(token);
				}
				else {
					answer = performOperation(token.charAt(0), 
							Integer.parseInt(list.remove()), 
							Integer.parseInt(list.remove()));
					list.add(String.valueOf(answer));
				}	
			}
			
			//Tokenizer for queue
			tokenizer = new StringTokenizer(input, " ");
			//create new queue
			priorityQueue = new PriorityQueue<Integer>();
			while(tokenizer.hasMoreTokens()) {
				token = tokenizer.nextToken();
				//System.out.println(priorityQueue);
				if(isDigit(token.charAt(0))) {
					priorityQueue.add(Integer.parseInt(token));
				}
				else {
					
					answer = performOperation(token.charAt(0), 
							priorityQueue.remove(), 
							priorityQueue.remove());
					priorityQueue.add(answer);
				}	
			}
			//Show the entire answer
			System.out.println(stack.pop() + " " + list.remove() + " " + priorityQueue.remove());
		}
	}
	
	public static boolean isDigit(char character) {
		return (character == '+' || character == '-' || character == '*') ? false : true;
	}
	
	public static int performOperation(char operator, int num1, int num2) {
		switch (operator) {
		case '+':
			return num2 + num1;
		case '-':
			return num2 - num1;
		case '*':
			return num2 * num1;
		}
		return 0;
	}
}