import java.util.Arrays;
import java.util.Scanner;

public class A077 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] score = new int[8]; // 정렬한 점수
		int[] score_origin = new int[8]; // 원래 점수
		int total = 0; // 총 점수
		int[] total_arr = new int[5]; // 총 점수에 더해진 점수들을 포함하는 배열
		
		for (int i = 0; i < 8; i++) {
			score[i] = s.nextInt();
			score_origin[i] = score[i];
		}
		
		Arrays.sort(score);
		
		for (int i = 3; i < 8; i++) {
			total_arr[i - 3] = score[i];
			total += score[i];
		}
		
		System.out.println(total);
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 5; j++) {
				if (total_arr[j] == score_origin[i]) {
					System.out.print((i + 1) + " ");
					break;
				}
			}
		}
	}

}
