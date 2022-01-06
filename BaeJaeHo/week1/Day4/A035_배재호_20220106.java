package week1;

import java.util.ArrayList;
import java.util.Scanner;

public class A035_πË¿Á»£_20220106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> answer = new ArrayList<Double>();
		int re = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<re;i++) {
			Scanner s = new Scanner(sc.nextLine());
			double num = s.nextDouble();
			while(s.hasNext()) {
				char c = s.next().charAt(0);
				if(c=='@') num*=3;
				else if (c=='%') num+=5;
				else if(c=='#') num -= 7;
				else break;
			};
			answer.add(num);
		}
		for(double ans : answer) System.out.printf("%.2f\n", ans);
		sc.close();
	}

}
