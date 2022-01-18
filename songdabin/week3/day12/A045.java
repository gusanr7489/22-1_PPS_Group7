import java.util.Scanner;

public class A045 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] alpha = new int[26];
		String word = s.next();
		int max = -1;
		char res = '?';
		
		word = word.toUpperCase();
		
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
				alpha[word.charAt(i) - 'A']++;
			}
		}
		
		for (int i = 0; i < 26; i++) {
			if (alpha[i] > max) {
				max = alpha[i];
				res = (char)(i + 65);
			}
			else if (alpha[i] == max) res = '?';
		}
		
		System.out.print(res);
	}

}
