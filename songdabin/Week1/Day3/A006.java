class Solution {
	boolean solution(String s) {
		boolean answer = true;
		int p_cnt = 0;
		int y_cnt = 0;
		
		s = s.toLowerCase();
		
		for (int i = 0; i < s.length(); i++) {
			if (s.split("")[i].equals("p")) p_cnt++;
			else if (s.split("")[i].equals("y")) y_cnt++;
		}
		
		if (p_cnt != y_cnt) answer = false;
		
		return answer;
	}
}
