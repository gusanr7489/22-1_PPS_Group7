import java.util.Scanner;

public class A033 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] total = new int[5];
		int person = 0, max = 0;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				total[i] += s.nextInt();
			}
		}
		
		for (int i = 0; i < 5; i++) {
			if (max < total[i]) {
				person = i + 1;
				max = total[i];
			}
		}
		
		System.out.println(person + " " + max);
	}

}
