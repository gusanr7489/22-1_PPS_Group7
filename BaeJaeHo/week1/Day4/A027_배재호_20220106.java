package week1;

import java.util.Scanner;

public class A027_배재호_20220106 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char cont;
		do {
			String number = sc.next();
			int k = sc.nextInt();
			System.out.println(solution(number, k));
			System.out.println("계속하시겠습니까?(y/n)");
			cont = sc.next().charAt(0);
		} while(cont != 'n');
		sc.close();
	}
	public static String solution(String number, int k) {
        int th =0;
        char bgst = number.charAt(0);
        for(int i=0;i<k+1;i++){
            if(bgst < number.charAt(i)) th = i;
            bgst = number.charAt(th);
        }
        if(th<k) return number.charAt(th)+solution(number.substring(th+1), k-th);
        return number.substring(th);
    }
}
