import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Main {

	static char decode(char tgt, char[] alphabet) {
		for (int x = 0; x < alphabet.length; x++)
			if (alphabet[x] == tgt)
				return (char) ('A' + x);
		return '*';
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String keyword = br.readLine();
		int index = Integer.parseInt(br.readLine());
		char[] alphabet = new char[26];
		int x;
		for (x = 0; x < keyword.length(); x++)
			alphabet[(index + x - 1) % alphabet.length] = keyword.charAt(x);
		//for (x = 0; x < alphabet.length; x++)
			//System.out.print(alphabet[x]);
		//System.out.println();
		char letter = 'A';
		for (x = 0; x < 26 - keyword.length(); x++) {
			if (!keyword.contains(Character.toString(letter)))
				alphabet[(index + keyword.length() + x - 1) % alphabet.length] = letter;
			else
				x--;
			letter++;
		}
		//for (x = 0; x < alphabet.length; x++)
			//System.out.print(alphabet[x]);
		String source = br.readLine();
		for (x = 0; x < source.length(); x++)
			System.out.print(decode(source.charAt(x), alphabet));
		br.close();
	}
}