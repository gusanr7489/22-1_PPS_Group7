import java.util.Scanner;

public class A022 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int call = 0, Y = 0, M = 0;
		
		for (int i = 0; i < N; i++) {
			call = s.nextInt();
			Y += ((call / 30) + 1) * 10;
			M += ((call / 60) + 1) * 15;
		}
		
		if (Y == M) System.out.println("Y M " + Y);
		else if (Y > M) System.out.println("M " + M);
		else if (Y < M) System.out.println("Y " + Y);
	}
	
}
