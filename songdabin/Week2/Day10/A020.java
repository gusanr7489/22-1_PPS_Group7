import java.util.Scanner;

public class A020 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int max = 0;
		int sum = 0;
		
		for (int i = 0; i < 4; i++) {
			int bye = s.nextInt();
			int hi = s.nextInt();
			
			sum = sum - bye + hi;
			
			if (max < sum) max = sum;
		}
		
		System.out.println(max);
	}

}
