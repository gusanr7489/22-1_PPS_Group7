package week2;

import java.util.Arrays;

public class A079_πË¿Á»£_20220114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = solution(array, commands);
	}
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands[0].length];
        for(int i=0;i<commands[0].length;i++){
            int[] tmp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            answer[i] = tmp[commands[i][2]];
        }
        return answer;
    }
}
