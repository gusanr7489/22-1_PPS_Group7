import java.util.Scanner;

public class A046 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[] cnt = new int[26];
		int chk = 0;
		
		for (int i = 0; i < n; i++) {
			String name = s.next();
			char first = name.charAt(0);
			cnt[first - 97]++;
		}

		for (int i = 0; i < 26; i++) {
			if (cnt[i] >= 5) {
				System.out.print((char)(i + 97));
				chk = 1;
			}
		}
		
		if (chk == 0) System.out.print("PREDAJA");
	}

}
