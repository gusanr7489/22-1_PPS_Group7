package week2;

import java.util.Arrays;

public class A078_πË¿Á»£_20220114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c = {3, 0, 6, 1, 5};
		System.out.println(solution(c));
	}
	public static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for(int i=0;i<citations.length;i++){
        	if(citations[i]>citations.length-i-1) {
            	answer = citations[i];
            	break;
            }
        }
        return answer;
    }
}
