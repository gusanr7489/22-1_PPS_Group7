import java.util.Arrays;
import java.util.Scanner;

public class A018 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		int N = s.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		int min = 0;
		
		for (int i = 0; i < N; i++) {
			A[i] = s.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			B[i] = s.nextInt();
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		for (int i = 0; i < N; i++) {
			min += A[i] * B[N - 1 - i];
		}
		
		System.out.println(min);
	}

}
