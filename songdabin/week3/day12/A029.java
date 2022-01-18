import java.util.Scanner;

public class A029 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int chk = s.nextInt();
		
		if (N > 5) System.out.println("Love is open door");
		else {
			if (chk == 1) {
				for (int i = 1; i < N; i++) {
					System.out.println((i + 1) % 2);
				}
			}
			else if (chk == 0) {
				for (int i = 1; i < N; i++) {
					System.out.println(i % 2);
				}
			}
		}
	}

}
