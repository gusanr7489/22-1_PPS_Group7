import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class A082 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		String[][] member = new String[N][2];
		
		for (int i = 0; i < N; i++) {
			member[i][0] = s.next();
			member[i][1] = s.next();
		}
		
		Arrays.sort(member, new Comparator<String[]>() {
			@Override
			public int compare(String[] str1, String[] str2) {
				return Integer.parseInt(str1[0]) - Integer.parseInt(str2[0]);
			}
		});
		
		for (int i = 0; i < N; i++) {
			System.out.println(member[i][0] + " " + member[i][1]);
		}
	}

}
