import java.util.Scanner;

public class A008 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int c = s.nextInt();
		int n = 0;
		double sum = 0.0, avg = 0.0, cnt = 0.0;
		
		for (int i = 0; i < c; i++) {
			n = s.nextInt();
			int[] score = new int[n];
			
			sum = 0;
			
			for (int j = 0; j < n; j++) {
				score[j] = s.nextInt();
				sum += score[j];
			}
			
			avg = sum / n;
			cnt = 0;
			for (int j = 0; j < n; j++) {
				if (score[j] > avg) cnt++;
			}
			
			System.out.printf("%.3f%%\n",(cnt/n)*100);
		}
	}

}
