import java.util.Arrays;
import java.util.Scanner;

public class A083 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int[] num = new int[N];
		int rec = 0;
		
		for (int i = 0; i < N; i++) {
			num[i] = s.nextInt();
		}
		
		Arrays.sort(num);
		
		for (int i = 0; i < N; i++) {
			if (rec != num[i]) {
				System.out.print(num[i] + " ");
				rec = num[i];
			}
		}
	}

}
