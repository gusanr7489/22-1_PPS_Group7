import java.util.Scanner;

public class A049 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String input = "";
		char[] vowel = {'a', 'i', 'o', 'u', 'e'};
		
		while (true) {
			input = s.next();
			
			if (input.equals("end")) break;
			
			else {
				boolean chk = true;
				boolean has_vowel = false;
				int cnt_vowel = 0;
				int cnt_con = 0;
				
				for (int i = 0; i < input.length(); i++) {
					boolean vowel_chk = false;
					char c = input.charAt(i);
					
					for (int j = 0; j < vowel.length; j++) {
						if (c == vowel[j]) {
							has_vowel = true;
							vowel_chk = true;
							cnt_vowel++;
							cnt_con = 0;
							break;
						}
					}
					
					if (vowel_chk == false) {
						cnt_con++;
						cnt_vowel = 0;
					}
					
					if (i == input.length() - 1 && has_vowel == false) {
						System.out.println("<" + input + "> is not acceptable.");
						chk = false;
						break;
					}
					
					if (i >= 1) {
						if (c == input.charAt(i - 1) && c != 'e' && c != 'o') {
							System.out.println("<" + input + "> is not acceptable.");
							chk = false;
							break;
						}
						
						else if (cnt_vowel >= 3 || cnt_con >= 3) {
							System.out.println("<" + input + "> is not acceptable.");
							chk = false;
							break;
						}
					}
				}
				
				if (chk == true) System.out.println("<" + input + "> is acceptable.");
			}
		}
	}
}
