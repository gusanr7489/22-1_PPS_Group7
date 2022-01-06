package week1;

import java.util.Scanner;

public class A032_πË¿Á»£_20220106 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int re = sc.nextInt();
		int cnt=0;
		int[] answer = new int[re];
		do {
			int floor = sc.nextInt();
			int room = sc.nextInt();
			answer[cnt] = solution(floor, room);
			cnt++;
		}while(cnt<2);
		for(int ans : answer) System.out.println(ans);
		for(int i=14;i>=0;i--) {
			for(int j=1;j<15;j++) {
				System.out.print(solution(i,j)+"\t");
			}
			System.out.println();
		}
		sc.close();
	}
	public static int solution(int k, int n) {
		int answer = 0;
		if(k==0) answer = n;
		else if(n==1) answer =  1;
		else {
			//for(int i=0;i<n;i++) answer += solution(k-1, n-i);	// ∆ƒΩ∫ƒÆ ªÔ∞¢«¸?
			return solution(k-1, n)+solution(k, n-1);
		}
		return answer;
	}
	
}
