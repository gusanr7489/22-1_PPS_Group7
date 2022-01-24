import java.util.Scanner;

public class A048 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			boolean[] alpha = new boolean[26]; // 알파벳 사용
			boolean chk = true; // 그룹 단어 확인
			
			String word = s.next();
			for (int j = 0; j < word.length(); j++) {
				int idx = word.charAt(j) - 'a';
				// 사용된 알파벳이면
				if (alpha[idx] == true) {
					// 이전에서 사용한 알파벳이 아니면
					if (word.charAt(j) != word.charAt(j - 1)) {
						chk = false; // 그룹 단어 체크를 false로
						break;
					}
				}
				else alpha[idx] = true; // 사용된 알파벳이 아니면, 사용되었다고 표시
			}
			if (chk == true) cnt++; // 그룹 단어가 맞으면 cnt 증가
		}
		
		System.out.println(cnt);
	}
}
