import java.util.Scanner;

public class A112 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		for (int i = 0; i < N; i++) {
			int k = s.nextInt();
			System.out.println((int)(Math.pow(2, k)) - 1);
		}
	}

}
