package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A077_πË¿Á»£_20220114 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] score = new int[8];
		for(int i=0;i<8;i++) {
			score[i] = Integer.parseInt(br.readLine());
		}
		score = solution(score);
		
		int total = 0;
		for(int i: score) total+=i;
		System.out.println(total);
		for(int i=0;i<score.length;i++)	if(score[i] !=0) System.out.print(i+1+" ");
		
		br.close();
	}
	
	public static int[] solution(int[] score) {
		int remove = 0;
		int mini = 100;
		for(int i=0;i<score.length;i++) {
			if(mini > score[i] && score[i]>0) {
				mini = score[i];
				remove = i;
			}
		}
		score[remove] = 0;
		mini=100;
		for(int i=0;i<score.length;i++) {
			if(mini > score[i] && score[i]>0) {
				mini = score[i];
				remove = i;
			}
		}
		score[remove] = 0;
		return score;
	}
}
