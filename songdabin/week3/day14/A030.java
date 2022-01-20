import java.util.Scanner;

public class A030 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		double feel = s.nextDouble();
		
		double[] p = new double[4];
		
		for (int i = 0; i < 4; i++) {
			p[i] = s.nextDouble();
		}
		
		feel = (1 - feel) * 1000;
		for (int i = 0; i < N; i++) {
			feel = feel * p[0] + (1000 - feel) * p[2];
		}
		
		System.out.println(String.format("%.0f", feel));
		System.out.println(String.format("%.0f", 1000 - feel));
	}
}
