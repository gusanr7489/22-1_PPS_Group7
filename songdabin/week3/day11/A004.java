import java.util.ArrayList;
import java.util.Arrays;

public class A004 {
	public int[] solution(int[] arr, int divisor) {
		int[] answer = {-1};
		ArrayList<Integer> ans_list = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0)
				ans_list.add(arr[i]);
		}
		
		if (ans_list.size() == 0) { // divisor로 나누어 떨어지는 element가 하나도 없다면
			return answer; // 배열에 -1을 담아 반환
		} else {
			answer = new int[ans_list.size()];
			for (int i = 0; i < answer.length; i++)
				answer[i] = ans_list.get(i);
			Arrays.sort(answer);
		}
		
		return answer;
	}
}
