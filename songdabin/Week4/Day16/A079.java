import java.util.Arrays;

public class A079 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		
		for (int i = 0; i < commands.length; i++) {
			// commands[i][0](i번째) ~ commands[i][1](j번째) | commands[i][2] -> K번째
			// commands[i][0]에 -1 하는 이유는 0부터 시작하니까
			int[] cpy = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
			Arrays.sort(cpy);
			answer[i] = cpy[commands[i][2] - 1];
		}
		
		return answer;
	}
}
