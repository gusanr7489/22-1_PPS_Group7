import java.util.Scanner;

public class A032 {
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in);
		
		int T = s.nextInt();
		int[][] num = new int[15][15];
		int k = 0, n = 0;
		
		for (int i = 0; i < 15; i++) {
			num[i][1] = 1;
			num[0][i] = i;
		}
		
		for (int i = 1; i < 15; i++) {
			for (int j = 2; j < 15; j++) {
				num[i][j] = num[i][j-1] + num[i-1][j];
			}
		}
		
		for (int i = 0; i < T; i++) {
			 k = s.nextInt();
			 n = s.nextInt();
			 System.out.println(num[k][n]);
		}
	}
}
