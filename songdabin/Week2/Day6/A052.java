import java.util.Scanner;

public class A052 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int test = s.nextInt();
		
		for (int i = 0; i < test; i++) {
			int score = 0, chk = 0;
			String ox = s.next();
			for (int j = 0; j < ox.length(); j++) {
				if (ox.charAt(j) == 'O') {
					chk ++;
					score += chk;
				}
				else {
					chk = 0;
				}
			}
			System.out.println(score);
		}
	}

}
